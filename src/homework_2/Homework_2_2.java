package homework_2;

/*
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm». Если –5>= t >–20,
то вывести «Normal». Если –20>= t, то вывести «Cold»
 */

import java.util.Scanner;

public class Homework_2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        int t = scanner.nextInt();
        System.out.println(t);

        if (t > -5) {
            System.out.println("Warm");
        } else if ((-5) >= t && t > (-20)) {
            System.out.println("Normal");
        } else if ((-20) >= t) {
            System.out.println("Cold");
        } else {
            System.out.println("Вы ввели не число");
        }
        scanner.close();

    }
}