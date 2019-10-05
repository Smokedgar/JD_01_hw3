package by.htp.wh3.task7;

/*
 * 7. Описать класс, представляющий треугольник. 
 * Предусмотреть методы для создания объектов, вычисления площади, 
 * периметра и точки пересечения медиан.
 */

public class Task7 {

    public static void main(String[] args) {
	Triangle t = new Triangle(3, 4, 5);
	TriangleLogic tl = new TriangleLogic();

	System.out.println("S = " + tl.calcP(t));
	System.out.println("P = " + tl.calcS(t));
    }
}
