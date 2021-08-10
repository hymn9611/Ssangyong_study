package sql.practice2.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import sql.practice.util.DBConnect;

public class LocationDAO {
	private DBConnect dbConnect;
	
	public LocationDAO() {
		dbConnect = new DBConnect();
	}
	
	//subquery : 사원번호 100인 사원이 근무하는 부서가 있는 지역의 주소는?
	public LocationDTO getLocation(int employee_id) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		LocationDTO locationDTO = null;
		
		try {
			con=dbConnect.getConnect();
			String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID="
					+ "(SELECT LOCATION_ID FROM DEPARTMENTS WHERE DEPARTMENT_ID="
					+ "(SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE EMPLOYEE_ID=?))";
			st = con.prepareStatement(sql);
			//6 : ? 설정
			st.setInt(1, employee_id);
			rs = st.executeQuery();
			
			//한 개 꺼내는 것은 if!!
			if(rs.next()) {
				locationDTO = new LocationDTO();
				locationDTO.setLocation_id(rs.getInt("location_id"));
				locationDTO.setStreet_address(rs.getString("street_address"));
				locationDTO.setPostal_code(rs.getString("postal_code"));
				locationDTO.setCity(rs.getString("city"));
				locationDTO.setState_province(rs.getString("state_province"));
				locationDTO.setCountry_id(rs.getString("country_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, st, con);
		}
		return locationDTO;
	}
	
	//subquery : 사원번호 100인 사원이 근무하는 대륙은?
	//**풀어보기!!
	
	
	//LOCATION의 주소 갯수를 리턴하고 출력하기
	public int getCount() {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		int count = 0;
		
		try {
			//3. DB접속
			con = dbConnect.getConnect();
			//4. SQL문 생성
			String sql = "SELECT COUNT(LOCATION_ID) FROM LOCATIONS";
			//5. SQL문 미리보내기
			st = con.prepareStatement(sql);
			//6. ? 작성
			//7. 최종전송 후 결과처리
			rs = st.executeQuery();
			
			rs.next(); //false
			count = rs.getInt(1);
//			count = rs.getInt(1);
//			System.out.println(count);
//			System.out.println(rs.getInt(1));

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, st, con);
		}
		
		return count;
	}//getCount()메서드 종료
	
	//주소의 일부를 받아서 검색하고 찾은 것들을 출력하는 getSearch()메서드
	public ArrayList<LocationDTO> getSearch(String search) {
		
		Connection con = null;
		PreparedStatement st= null;
		ResultSet rs = null;
		ArrayList<LocationDTO> ar = new ArrayList<LocationDTO>();
		
		try {
			con = dbConnect.getConnect();
			String sql = "SELECT * FROM LOCATIONS WHERE STREET_ADDRESS LIKE ?";
			st = con.prepareStatement(sql);
			st.setString(1, "%"+search+"%");
			
			rs = st.executeQuery();
			while(rs.next()) {
				LocationDTO locationDTO = new LocationDTO();
				locationDTO.setLocation_id(rs.getInt("location_id"));
				locationDTO.setStreet_address(rs.getString("street_address"));
				locationDTO.setPostal_code(rs.getString("postal_code"));
				locationDTO.setCity(rs.getString("city"));
				locationDTO.setState_province(rs.getString("state_province"));
				locationDTO.setCountry_id(rs.getString("country_id"));
				ar.add(locationDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, st, con);
		}
		
		return ar;
	}
	
	
	//Location Table에서 매개변수 id와 일치하는 정보를 조회
	public LocationDTO getOne(int location_id) {
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		LocationDTO locationDTO = null;
		
		try {
			con = dbConnect.getConnect();
			String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID=?";
			st = con.prepareStatement(sql);
			st.setInt(1, location_id);
			
			rs = st.executeQuery();
			if(rs.next()) {
				locationDTO = new LocationDTO();
				locationDTO.setLocation_id(rs.getInt("location_id"));
				locationDTO.setStreet_address(rs.getString("street_address"));
				locationDTO.setPostal_code(rs.getString("postal_code"));
				locationDTO.setCity(rs.getString("city"));
				locationDTO.setState_province(rs.getString("state_province"));
				locationDTO.setCountry_id(rs.getString("country_id"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return locationDTO;
	}
	
	//LOCATIONS TABLE을 조회해서 출력
	public ArrayList<LocationDTO> getList() {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<LocationDTO> ar = new ArrayList<LocationDTO>();
		
		try {
			con = dbConnect.getConnect();
			String sql = "SELECT * FROM LOCATIONS";
			st = con.prepareStatement(sql);
			rs = st.executeQuery();
			
			while(rs.next()) {
				LocationDTO locationDTO = new LocationDTO();
				locationDTO.setLocation_id(rs.getInt("location_id"));
				locationDTO.setStreet_address(rs.getString("street_address"));
				locationDTO.setPostal_code(rs.getString("postal_code"));
				locationDTO.setCity(rs.getString("city"));
				locationDTO.setState_province(rs.getString("state_province"));
				locationDTO.setCountry_id(rs.getString("country_id"));
				ar.add(locationDTO);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnect.disConnect(rs, st, con);
		}
		
		return ar;
		
	}

}
