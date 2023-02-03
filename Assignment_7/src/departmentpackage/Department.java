package departmentpackage;

public class Department {
	private String departmentName1 = "Developing";
	private String departmentName2 = "Analysing";

	public void displayDepartment() {
		System.out.println("Department list");
		System.out.println(departmentName1);
		System.out.println(departmentName2);
		Project project = new Project();
		project.displayProject();
	}
}
