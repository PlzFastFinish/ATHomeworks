package homework_6.figure;

public class Circle extends Figure {

    @Override
    public double calculationArea(double pi, double r) {
        double s = pi * (Math.pow(r, 2));
        System.out.println("Площадь круга равна: " + s);
        return s;
    }

    @Override
    public double calculationPerimeter(double pi, double r) {
        double p = 2 * pi * r;
        System.out.println("Периметр круга равен: " + p);
        return p;
    }
}
