package sql.practice.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sql.practice.util.DBConnect;

public class DBTest {
	
	//**Q : 다른 클래스를 private로 선언후 생성자에서 초기화 하는 이유는?
	private DBConnect dbConnect;
	public DBTest() {
		dbConnect = new DBConnect();
	}
	
	//DEPARTMENTS 테이블에서 DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID 출력하는 메서드생성
	public void getList() {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//3. DB접속
			//sql.practice.location.LocationDAO와 다른점은?
			//sql.practice.util에 DBConnect를 생성하여 DB연결코드 간소화
			//** sql.practice.util 패키지의 DBConnect 코드를 외우기
			con=dbConnect.getConnect();
			
			//4. SQL문 생성
			String sql = "SELECT * FROM DEPARTMENTS";
			
			//5. SQL문 미리보내기
			st = con.prepareStatement(sql);
			
			//6. 최종 전송 후 결과처리
			rs = st.executeQuery();
			
			//**Q : while을 쓰는 경우와 for을 쓰는 경우는??
			while(rs.next()) {
				System.out.print(rs.getInt("DEPARTMENT_ID")+"\t");
				System.out.print(rs.getString("DEPARTMENT_NAME")+"\t");
				System.out.println(rs.getInt("MANAGER_ID"));
				System.out.println("-------------------------------------");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, st, con);
		}
	}//getList()메서드 종료
	
	//
	public void getOne() {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		//3. DB접속
		try {
			con = dbConnect.getConnect();
			int id=40;
			
			//4. SQL문 생성
			//DEPARTMENTS 테이블에서 DEPARTMENT_NAME 하나를 뽑는다!
			String sql = "SELECT DEPARTMENT_NAME AS DE FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
			
			//5. 미리 전송
			st = con.prepareStatement(sql);
			
			//6. ?값 설정 - setXXX(?의 인덱스번호, 값)
			st.setInt(1, id); //DEPARTMENT_ID가 40인 1번째 인덱스 값
			//**st.setInt(2, id);를 입력하면 부적합한 열 인덱스가 나온다
			//SQLDeveloper에서 DEPARTMENTS테이블에 DEPARTMENT_ID가 40인 값을 출력해보면 한 개 밖에 없기 때문이다.
			
			//7. 최종 전송 후 결과처리
			rs = st.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString("DE")); //** DE가 무엇인가? SQL문 생성에서 AS DE를 작성함!
			} else {
				System.out.println("그런 번호는 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, st, con);
		}
	}//getOne()메서드 종료
	
	//SELECT COUNT(DEPARTMENT_ID) FROM DEPARTMENTS;
	//count() 함수의 결과물 출력
	public void getCount() {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//3. DB접속
			con = dbConnect.getConnect();
			
			//4. SQL문 작성
			String sql = "SELECT COUNT(DEPARTMENT_ID) FROM DEPARTMENTS";
			
			//5. 미리전송
			st = con.prepareStatement(sql);
			
			//6. ?
			
			//7. 최종 전송 후 결과처리
			rs = st.executeQuery();
			
			rs.next(); // ** if문/for문 쓰는경우, 안쓰는 경우
			System.out.println(rs.getInt(1));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, st, con);
		}
		
	}
}
