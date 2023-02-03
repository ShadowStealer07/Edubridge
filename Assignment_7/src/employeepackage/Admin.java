package employeepackage;

public class Admin {
	private String adminName = "kavitha";
	private String adminId = "A190304A";

	public void displayAdmin() {
		System.out.println("Admin details");
		System.out.println();
		System.out.println(adminName);
		System.out.println(adminId);
		Manager manager = new Manager();
		manager.displayManager();
		Employee employee = new Employee();
		employee.displayEmployee();
	}
}
