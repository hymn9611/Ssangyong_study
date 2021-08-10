package sql.practice2.location;

//DTO : Data Transfer Object - 데이터덩어리
public class LocationDTO {
	//1. 멤버변수의 지정자는 모두 private
	//2. 멤버변수의 데이터타입과 변수명은 DB테이블의 컬럼명과 일치
	//3. Getter, Setter 생성
	//4. 생성자는 여러개 가능하지만 디폴트 생성자가 꼭 필요하다.
	//** 생성자를 건들지 않으면 디폴트 생성자는 자동 생성
	
	//LOCATIONS 테이블의 컬럼명 모두 선언
	private int location_id;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
	
	
	//Getter, Setter 생성하기
	//**직접 타이핑해보기
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState_province() {
		return state_province;
	}
	public void setState_province(String state_province) {
		this.state_province = state_province;
	}
	
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	
}
