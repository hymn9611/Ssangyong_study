package sql.practice2;

import sql.practice2.employees.EmployeeDAO;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.getList();
	}

}
