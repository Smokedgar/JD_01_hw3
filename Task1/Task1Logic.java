package by.htp.hw3.task1;

public class Task1Logic {
	public int sum(Task1 test1) {
		return test1.getvar1() + test1.getvar2();
	}

	public int max(Task1 test1) {
		if (test1.getvar1() > test1.getvar2() ) {
			return test1.getvar1();
		} else {
			return test1.getvar2();
		}
	}
}