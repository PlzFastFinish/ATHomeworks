package homework_6.figure;

public class Triangle extends Figure {

    @Override
    public double calculationArea(double a, double b) {
        double s = (double) 1 / 2 * (a * b);
        System.out.println("Площадь треугольника равна: " + s);
        return s;
    }

    @Override
    public double calculationPerimeter(double a, double b) {
        double p = 2 * a + b;
        System.out.println("Периметр треугольника равен: " + p);
        return p;
    }
}
