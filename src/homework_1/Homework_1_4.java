package homework_1;

/*
В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу,которая округляет число n
до ближайшего целого и выводящую результат на экран.
 */

public class Homework_1_4 {
    public static void main(String[] args) {
        double n = 33.33;
        long res = Math.round(n);
        System.out.println("Ближайшее целое число - " + res);
    }
}
