package sql.practice2.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import sql.practice.util.DBConnect;

public class EmployeeDAO {
	
	private DBConnect dbConnect;
	public EmployeeDAO() {
		dbConnect = new DBConnect();
	}
	
	//1번문제 : 전체사원 출력하기
	public ArrayList<EmployeeDTO> getList() {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<EmployeeDTO> ar = new ArrayList<EmployeeDTO>();
		try {
			//1. DB 연결 (Connection)
			con = dbConnect.getConnect();

			//2. SQL문 작성
			String sql = "SELECT * FROM EMPLOYEES";
			
			//3. 미리 보내기
			st = con.prepareStatement(sql);
			
			//4. ? 설정하기
			
			//5. 최종 전송 후 결과처리
			rs = st.executeQuery();
			//몇명이 오는지 모르니 while문 사용하기
			while(rs.next()) {
				EmployeeDTO employeeDTO = new EmployeeDTO();
				employeeDTO.setEmployee_id(rs.getInt("Employee_id"));
				employeeDTO.setFirst_name(rs.getString("First_name"));
				employeeDTO.setLast_name(rs.getString("Last_name"));
				employeeDTO.setEmail(rs.getString("Email"));
				employeeDTO.setPhone_number(rs.getString("Phone_number"));
				employeeDTO.setHire_date(rs.getDate("Hire_date"));
				employeeDTO.setJob_id(rs.getString("Job_id"));
				employeeDTO.setSalary(rs.getInt("Salary"));
				employeeDTO.setCommission_pct(rs.getDouble("Commission_pct"));
				employeeDTO.setManager_id(rs.getInt("Manager_id"));
				employeeDTO.setDepartment_id(rs.getInt("Department_id"));
				ar.add(employeeDTO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//6. 자원해제
			dbConnect.disConnect(rs, st, con);
		}
		
		return ar;
	}//getList()메서드 종료
	
	//2번문제 : 사원번호를 입력해서 한 사원의 정보를 출력
	
	//3번문제 : Last_name을 검색해서 정보를 출력
	
	//4번문제 : First_name을 검색해서 정보를 출력
	
	//5번문제(1) : 전체 평균 급여의 정보를 출력
	
	//5번문제(2) : 부서별 평균 급여의 정보를 출력
	
	//부서별 평균이 어느부서의 평균인지 알고 싶을 때
	
//	public ArrayList<Double> getAvg() {
//		ArrayList<Double> ar = new ArrayList<Double>();
//		return ar;
//	}
	
	public void getAvg2() {
		HashMap<String, Object> obj = new HashMap<String,Object>();
		obj.put("id", 20);
		obj.put("avg", 1000.12);
	}
}
