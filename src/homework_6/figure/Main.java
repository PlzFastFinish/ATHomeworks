package homework_6.figure;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        circle.calculationArea(3.14, 10);

        rectangle.calculationArea(3, 4);

        triangle.calculationArea(4, 4);

        circle.calculationPerimeter(3.14, 5);

        rectangle.calculationPerimeter(3, 7);

        triangle.calculationPerimeter(5, 5);

        Figure[] figures = new Figure[5];

        figures[0] = new Circle();
        figures[1] = new Rectangle();
        figures[2] = new Triangle();
        figures[3] = new Circle();
        figures[4] = new Rectangle();

        double sumPerimeter = 0;

        for(Figure figure : figures){
            sumPerimeter += figure.calculationPerimeter(5, 5);
        }
        System.out.println("Сумма периметров всех фигур: " + sumPerimeter);
    }
}
