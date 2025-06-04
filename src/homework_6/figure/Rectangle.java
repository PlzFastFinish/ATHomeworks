package homework_6.figure;

public class Rectangle extends Figure {

    @Override
    public double calculationArea(double a, double b) {
        double s = a * b;
        System.out.println("Площадь прямоугольника равна: " + s);
        return s;
    }

    @Override
    public double calculationPerimeter(double a, double b) {
        double p = (a + b) * 2;
        System.out.println("Периметр прямоугольника равен: " + p);
        return p;
    }
}
