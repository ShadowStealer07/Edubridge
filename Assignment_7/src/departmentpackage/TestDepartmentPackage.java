package departmentpackage;

import employeepackage.*;

public class TestDepartmentPackage {
	public static void main(String[] args) {
		Department department = new Department();
		department.displayDepartment();
		Admin admin = new Admin();
		admin.displayAdmin();
	}

}
