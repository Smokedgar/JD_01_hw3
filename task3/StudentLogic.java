package by.htp.nw3.task3;
public class StudentLogic {
	static public void printPerfect(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (isPerfect(students[i])) {
				System.out.println(students[i].getName() + " из группы " + students[i].getGroup());
			}
		}
	}
	static public void printAllStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName() + " из группы " + students[i].getGroup());
		}
	}
	static private boolean isPerfect(Student student) {
		boolean isPerfect = true;
		for (int i = 0; i < student.getprgs().length; i++) {
			if (student.getprgs()[i] < 8) {
				isPerfect = false;
			}
		}
		return isPerfect;
	}

}
