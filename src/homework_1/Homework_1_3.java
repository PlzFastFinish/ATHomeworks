package homework_1;

/*
В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n.
Например: n = 126, в результате мы должны получить 9 (1+2+6).
 */

public class Homework_1_3 {
    public static void main(String[] args) {
        int n = 256, a, b;
        System.out.println(n);
        a = n / 100;
        b = (n / 10) % 10;
        n = n % 10;
        System.out.println(a + " + " + b + " + " + n);
        System.out.println("Сумма равна " + (a + b + n));
    }
}
