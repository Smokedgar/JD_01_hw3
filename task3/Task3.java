package by.htp.nw3.task3;
/*
* 3. Создайте класс с именем Student, содержащий поля: 
* фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
* Создайте массив из десяти элементов такого типа. 
* Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, 
* равные только 9 или 10.
*/
public class Task3 {

	public static void main(String[] args) {
		Student[] list;
		list = new Student[10];
		list[0] = new Student("Лепешо Э.В.", 14, new int[] { 9, 6, 9, 9, 9 });
		list[1] = new Student("Иванова П.И.", 14, new int[] { 8, 6, 7, 9, 10 });
		list[2] = new Student("Каширский А.В.", 14, new int[] { 9, 10, 10, 9, 10 });
		list[3] = new Student("Дешкевич М.В.", 14, new int[] { 9, 9, 9, 9, 10 });
		list[4] = new Student("Гаврош Н.А.", 14, new int[] { 8, 9, 9, 9, 7 });
		list[5] = new Student("Алесандров А.А.", 14, new int[] { 9, 10, 8, 9, 10 });
		list[6] = new Student("Качалов А.Н.", 14, new int[] { 8, 6, 7, 9, 10 });
		list[7] = new Student("Сухоцкая И.А.", 14, new int[] { 10, 8, 9, 9, 10 });
		list[8] = new Student("Булак Н.А.", 14, new int[] { 9, 9, 9, 9, 9 });
		list[9] = new Student("Врублевская Л.Д.", 14, new int[] { 10, 9, 10, 9, 9 });

		StudentLogic.printPerfect(list);
	}

	

}