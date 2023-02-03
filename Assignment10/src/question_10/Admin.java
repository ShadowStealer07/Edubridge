package question_10;

import java.util.Arrays;

public class Admin extends Person {
	static Teachers[] teacherList=new Teachers[15]; 
	//add coursearray
	static Course[] courseList=new Course[15];
	//add studentarray
	static Students[] studentList=new Students[15];
	static int count=0;
	static int countS=0;
	static int countC=0;
	//count for course and student
	public Admin(String id, String name, String password, String email) {
		super(id, name, password, email);
		// TODO Auto-generated constructor stub
	}
	
	
public static Teachers[] getTeacherList() {
		return teacherList;
	}


	public static void setTeacherList(Teachers[] teacherList) {
		Admin.teacherList = teacherList;
	}


	public static Course[] getCourseList() {
		return courseList;
	}


	public static void setCourseList(Course[] courseList) {
		Admin.courseList = courseList;
	}


	public static Students[] getStudentList() {
		return studentList;
	}


	public static void setStudentList(Students[] studentList) {
		Admin.studentList = studentList;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Admin.count = count;
	}


	public static int getCountS() {
		return countS;
	}


	public static void setCountS(int countS) {
		Admin.countS = countS;
	}


	public static int getCountC() {
		return countC;
	}


	public static void setCountC(int countC) {
		Admin.countC = countC;
	}


@Override
	public String toString() {
		return super.toString()+"Admin [teacherList=" + Arrays.toString(teacherList) + "]";
	}

public void addNewTeacher(Teachers teacher)
{
	teacherList[count++]=teacher;//0--10000,1--20000,2--30000
	
}
public void viewTeacherList()
{
	for(int i =0;i<count;i++)//1<3
	{
		System.out.println("teacher list  : "+teacherList[i]);
	}
}
public void modifyTeacherInfo(String id,String password)
{
	for(int i=0;i<count;i++)//325
	{
		if(teacherList[i].getId().equals(id))
		{
			teacherList[i].setPassword(password);
			break;
		}
	}

}
public void removeTeacherById(String id)
{   int pos=-1;
	for(int i=0;i<count;i++)
	{
		if(teacherList[i].getId().equals(id))
		{
			pos= i;
			break;
		}
	}
	for(int i=pos;i<count;i++)
	{
		teacherList[i] = teacherList[i+1];
		
	}
	if(pos>=0)
	{
		count--;
	}
	}
//implement add student,course
public void AddNewStudents(Students student) {
		studentList[countS++] = student;
	}

	public void viewStudentList() {
		for (int i = 0; i < countS; i++) {
			System.out.println("student list  : " + studentList[i]);
		}
	}

	public void modifyStudentInfo(String id, String password) {
		for (int i = 0; i < countS; i++) {
			if (studentList[i].getId().equals(id)) {
				studentList[i].setPassword(password);
				break;
			}
		}

	}

	public void removeStudentById(String id) {
		int pos = -1;
		for (int i = 0; i < countS; i++) {
			if (studentList[i].getId().equals(id)) {
				pos = i;
				break;
			}
		}
		for (int i = pos; i < countS; i++) {
			studentList[i] = studentList[i + 1];

		}
		if (pos >= 0) {
			countS--;
		}
	}
	//implement course add and modify
	public void AddNewCourse(Course course) {
		courseList[countC++] = course;
	}

	public void viewCourseList() {
		for (int i = 0; i < countC; i++) {
			System.out.println("course list  : " + courseList[i]);
		}
	}

	public void modifyCourseInfo(String id, String teacher) {
		for (int i = 0; i < countC; i++) {
			if (courseList[i].getId().equals(id)) {
				courseList[i].setTeacher(teacher);
				break;
			}
		}

	}

	public void removeCourseById(String id) {
		int pos = -1;
		for (int i = 0; i < countC; i++) {
			if (courseList[i].getId().equals(id)) {
				pos = i;
				break;
			}
		}
		for (int i = pos; i < countC; i++) {
			courseList[i] = courseList[i + 1];

		}
		if (pos >= 0) {
			countC--;
		}
	}
//implement update student and course
	public void assignCouse(String id,Course course) {
		for(int i=0;i<countS;i++) {
			if(studentList[i].getId().equals(id)) {
				studentList[i].setCourse(course);
			}
		}
	}
//implement delete student and course

}
