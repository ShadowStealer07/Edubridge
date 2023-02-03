package question_10;

public class Students extends Person{
	String id,name, password, email;
	Course course;
	boolean attendance;
	public Students(String id,String name, String password, String email,Course course) {
		super(id, name, password, email);
		this.id=id;
		this.name=name;
		this.password=password;
		this.email=email;
		this.course=course;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public boolean isAttendance() {
		return attendance;
	}
	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", course="
				+ course.getName() + ", attendance=" + attendance + "]";
	}	
}
