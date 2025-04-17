package homework_1;

/*
В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран
результат деления q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21,
а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
*/

public class Homework_1_5 {
    public static void main(String[] args) {
        int q = 34, w = 3;
        int res = q/w;
        int ost = q%w;
        System.out.println(q + " / " + w + " = " + res + " и " + ost + " в остатке.");
    }
}
