package by.htp.hw3.task1;
/*
 *  * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения 
 * этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, 
 * который находит наибольшее значение из этих двух переменных.
 */
public class Task1 {
	private int var1;
	private int var2;

	public Task1() {
		var1 = 0;
		var2 = 0;
	}

	public int getvar1() {
		return var1;
	}

	public int getvar2() {
		return var2;
	}

	public void printvar1() {
		System.out.println(var1);
	}

	public void printvar2() {
		System.out.println(var2);
	}

	public void setvar1(int var1) {
		this.var1 = var1;
	}

	public void setvar2(int var2) {
		this.var2 = var2;
	}
}