package homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = scanner.nextInt();

        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));

        System.out.print("Массив в обратном порядке: ");
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println();

        int min = array[0];
        for (int i = 1; i < a; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " + min);

        int max = array [0];
        for (int i = 1; i < a; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println();

        int index_min = 0;
        for (int i = 0; i < a; i++) {
            if (array[i] == min) {
                index_min = i;
            }
        }
        System.out.print("Минимальное значение индекса: " + index_min);
        System.out.println();

        int index_max = 0;
        for (int i = 0; i < a; i++) {
            if (array[i] == max) {
                index_max = i;
            }
        }
        System.out.println("Максимальное значение индекса: " + index_max);
        System.out.println();

        int zero_values = 0;
        for (int i = 0; i < a; i++) {
            if (array[i] == 0) {
                zero_values++;
            }
        }
        if (zero_values > 0) {
            System.out.println("Нулевых элементов: " + zero_values);
        } else {
            System.out.println("Нулевые элементы отсутствуют");
        }
        System.out.println();

        for (int i = 0; i < a / 2; i++) {
            int j = array[i];
            array[i] = array[(a - 1) - i];
            array[(a - 1) - i] = j;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        boolean asc = true;
        for (int i = 1; i < a; i++) {
            if (array[i] <= array[i - 1]) {
                asc = false;
                break;
            }
        }
        if (asc) {
            System.out.println("Массив заполнен по возрастанию");
        } else {
            System.out.println("Массив заполнен не по возрастанию");
        }
        scanner.close();
    }
}
