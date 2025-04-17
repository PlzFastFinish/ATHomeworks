package homework_1;

/*
В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n. Например:
n = 26, в результате мы должны получить 8 (2 + 6).
 */

public class Homework_1_2 {
    public static void main(String[] args) {
        int n = 33, a;
        System.out.println(n);
        a = n / 10;
        System.out.print(a);
        System.out.print(" + ");
        n = n % 10;
        System.out.println(n);
        n = a + n;
        System.out.println("n = " + n);
    }
}
