package homework_2;

/*
Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
 */

public class Homework_2_3 {
    public static void main(String[] args) {
        for (int i = 10; i < 21; i++) {
            System.out.println(i + " в квадрате " + " = " + Math.pow(i, 2));

        }
    }
}
