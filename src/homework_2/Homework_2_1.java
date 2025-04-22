package homework_2;

/*
Напишите программу, которая будет принимать на вход число из консоли и на выход будет выводить сообщение
четное число или нет. Для определения четности числа используйте операцию получения остатка от
деления (операция выглядит так: '% 2').
 */

import java.util.Scanner;

public class Homework_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int a = scanner.nextInt();
        System.out.println(a);

        if (a % 2 == 0) {
            System.out.println("Число " + a + " - четное");
        } else {
            System.out.println("Число " + a + " - не четное");
        }
        scanner.close();
    }
}
