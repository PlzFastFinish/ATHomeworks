package homework_6.figure;

abstract class Figure {

    public double calculationArea(double a, double b) {
        System.out.println("Подсчет площади");
        return a + b;
    }

    public double calculationPerimeter(double a, double b) {
        System.out.println("Подсчет периметра");
        return a + b;
    }
}
