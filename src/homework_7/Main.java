package homework_7;

public class Main {

    public static int getDivision(int a, int b) {
        return a / b;
    }

    public static int getParseInt(String a) {
        return Integer.parseInt(String.valueOf(a));
    }

    public static int getLengthStr(String str) {
        return str.length();
    }

    public static int getArrayElement(int[] array, int num) {
        return array[num];
    }

    public static void main(String[] args) {
        try {
            System.out.println(getDivision(2, 0));
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("На ноль не делится");
            System.out.println();
        }

        try {
            System.out.println(getParseInt("/"));
            System.out.println(getDivision(3, 0));
        } catch (NumberFormatException e) {
            System.out.println("Введите число");
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("Говорил же не делится");
            System.out.println();
        }

        try {
            System.out.println(getLengthStr(null));
            System.out.println(getParseInt("word"));
            System.out.println(getDivision(5, 0));

        } catch (NullPointerException | ArithmeticException | NumberFormatException e) {
            System.out.println("Делов наделал");
            System.out.println();
        }

        try {
            System.out.println(getArrayElement(new int[]{1, 2, 3, 4, 5}, 5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы за пределами массива");
            System.out.println();
        } finally {
            System.out.println("Закончили");
        }
    }
}
