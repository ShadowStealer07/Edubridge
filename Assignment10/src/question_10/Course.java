package question_10;

import java.util.Arrays;

public class Course {
	private String id,name,teacher;
	private String[] eStudents=new String[15];
	public Course(String id,String name,String teacher,String[] eStudents) {
		super();
		this.id=id;
		this.name=name;
		this.teacher=teacher;
		this.eStudents=eStudents;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String[] geteStudents() {
		return eStudents;
	}
	public void seteStudents(String[] eStudents) {
		this.eStudents = eStudents;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", teacher=" + teacher + ", eStudents="
				+ Arrays.toString(eStudents)  + "]";
	}
	
}
