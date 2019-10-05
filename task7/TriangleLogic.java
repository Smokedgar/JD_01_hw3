package by.htp.wh3.task7;

public class TriangleLogic {

    public double calcP(Triangle t) {
	return t.getA() + t.getB() + t.getC();
    }

    public double calcS(Triangle t) {
	double p = calcP(t) / 2;
	return Math.sqrt(p * (p - t.getA()) * (p - t.getB()) * (p - t.getC()));
    }
}
