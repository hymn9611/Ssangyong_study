package sql.practice;

import sql.practice.location.LocationDAO;
//import sql.practice.test.DBTest;

public class DBMain {

	public static void main(String[] args) {
		System.out.println("DB START!!");
		
//		DBTest dbTest = new DBTest();
//		dbTest.getList();
//		dbTest.getOne();
//		dbTest.getCount();
		
		LocationDAO dao = new LocationDAO();
		dao.getList();
		
		System.out.println("DB FINISH!!");
	}
}
