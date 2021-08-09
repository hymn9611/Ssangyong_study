package sql.practice.location;

//java.sql 패키지안에는 Connection, DriverManager, PreparedStatement, ResultSet 등의 Interface가 있다.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import sql.practice.util.DBConnect;

//DAO : Data Access Object - 데이터 접근 객체
public class LocationDAO {

//	** DBTest에서는 DBConnect를 사용하여 중복코드를 간편하게 작성하였다.
//	private DBConnect dbConnect;
//	public LocationDAO() {
//		dbConnect = new DBConnect();
//	}
	
//	public void getOne(int location_id) {
//		//****다음 practice2에서 다뤄보자
//	}
	
	public void getList() {
		//1. SQL의 테이블을 조회해서 출력(LOCATIONS테이블을 출력해볼 예정)
		String user = "user02";
		String password = "user02";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. Driver를 메모리에 로딩
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver); //**ERROR : driver 변수는 어디서 정의되었는가?
			System.out.println("드라이버 로딩 성공");
			
			//3. DB Connection
			//getConnection : Attempts to estabilish a connection to the given database URL.
			//DBConnect 사용시 con = dbConnect.getConnect();
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결성공");
			
			//4. SQL문 생성
			String sql = "SELECT * FROM LOCATIONS";
			
			//5. 미리전송
			st = con.prepareStatement(sql);
			
			//6. 최종 전송 후 결과처리
			rs = st.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("STREET_ADDRESS"));
				System.out.println(rs.getInt("LOCATION_ID"));
				System.out.println("-----------------");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//DBConnect 사용시 dbConnect.disConnect(rs, st, con);
			try {
				st.close();
				rs.close();
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
