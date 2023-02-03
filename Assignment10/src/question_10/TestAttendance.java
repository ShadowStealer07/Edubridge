package question_10;

import java.io.IOException;
import java.util.Arrays;

public class TestAttendance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Admin admin = new Admin("1234", "Harish", "hari@123", "harish@gmail.com");
		Teachers teacher = new Teachers("1234", "Indu", "indu#12", "indu@gmail.com");
		// Teacher
		admin.addNewTeacher(new Teachers("324", "Indu", "indu#12", "indu@gmail.com"));
		admin.addNewTeacher(new Teachers("325", "raj", "raj#12", "raj@gmail.com"));
		admin.addNewTeacher(new Teachers("326", "Kalyan", "k#12", "k@gmail.com"));

		admin.viewTeacherList();

		System.out.println("After modification");
		admin.modifyTeacherInfo("325", "raj@123");
		admin.viewTeacherList();

		System.out.println("After removal");
		admin.removeTeacherById("325");
		admin.viewTeacherList();

		// Course
		System.out.println("Adding Course");
		String[] studentList = { "varad", "world" };
		admin.AddNewCourse(new Course("13", "Science", "Indu", studentList));
		admin.AddNewCourse(new Course("11", "world", "Kalyan", studentList));

		admin.viewCourseList();

		System.out.println("After Modification");
		admin.modifyCourseInfo("13", "World");
		admin.viewCourseList();

		System.out.println("After Removal");
		admin.removeCourseById("11");
		admin.viewCourseList();

		// Student
		System.out.println("Adding student");
		admin.AddNewStudents(new Students("134", "Varad", "varad@123", "varad@gmail.com",new Course("13", "Science", "Indu", studentList)));
		admin.AddNewStudents(new Students("11", "world", "world@123", "world@gmail.com",new Course("13", "Science", "Indu", studentList)));

		admin.viewStudentList();

		System.out.println("After modification");
		admin.modifyStudentInfo("134", "raj@123");
		admin.viewStudentList();

		System.out.println("After removal");
		admin.removeStudentById("134");
		admin.viewStudentList();

		// assign course
		System.out.println("Assign course to student");
		admin.assignCouse("11", new Course("13", "Science", "Indu", studentList));
		admin.viewStudentList();

		// setAttendance
		System.out.println("Assign attendance");
		teacher.MarkAttendance("11", true);
		admin.viewStudentList();

	}
}
