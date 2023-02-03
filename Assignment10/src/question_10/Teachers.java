package question_10;

public class Teachers extends Person {
	Students[] s=new Students[15];
	public Teachers(String id, String name, String password, String email) {
		super(id, name, password, email);
		// TODO Auto-generated constructor stub
	}
	//mark attendance method 
	public void MarkAttendance(String id,boolean attendance) {
		s=Admin.getStudentList();
		for(int i=0;i<Admin.countS;i++) {
		if(s[i].getId().equals(id)) {
			Admin.getStudentList()[i].setAttendance(attendance);
		}
		}
	}
}
