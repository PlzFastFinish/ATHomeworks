package homework_8;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_8 {
    public static void main(String[] args) {
        int max, min, k = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String first = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String second = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String third = scanner.nextLine();
        String temp;
        String[] strings = new String[]{first, second, third};
        int[] length = new int[]{first.length(), second.length(), third.length()};
        if (length[0] == length[1] && length[1] == length[2]) {
            System.out.println("Длина строк одинаковая");
        } else {
            if (length[0] > length[1]) {
                max = length[0];
                min = length[1];
            } else {
                max = length[1];
                min = length[0];
            }
            if (max < length[2]) {
                max = length[2];
            }
            if (min > length[2]) {
                min = length[2];
            }
            for (int i = 0; true; i++) {
                if (length[i] == max) {
                    System.out.println("Самая длинная строка - " + strings[i] + ", её длина - " + max);
                    break;
                }
            }
            for (int i = 0; true; i++) {
                if (length[i] == min) {
                    System.out.println("Самая короткая строка - " + strings[i] + ", её длина - " + min);
                    break;
                }
            }
        }
        System.out.println("----------------------------------------");
        if (length[0] > length[1]) {
            temp = strings[0];
            strings[0] = strings[1];
            strings[1] = temp;
        }
        if (length[0] > length[2]) {
            temp = strings[0];
            strings[0] = strings[2];
            strings[2] = temp;
        }
        if (length[1] > length[2]) {
            temp = strings[1];
            strings[1] = strings[2];
            strings[2] = temp;
        }
        System.out.println("Строки упорядоченные по возрастанию:");
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < 3; i++) {
            length[i] = strings[i].length();
        }
        System.out.println("----------------------------------------");
        int sum = (first.length() + second.length() + third.length()) / 3;
        if (first.length() >= sum && second.length() >= sum && third.length() >= sum) {
            System.out.println("Строка с длиной меньше средней отсутствует");
        } else {
            System.out.println("Строка с длиной меньше средней:");
            for (int i = 0; i < 3; i++) {
                if (length[i] < sum) {
                    System.out.println(strings[i]);
                    break;
                }
            }
        }
        System.out.println("----------------------------------------");
        for (String string : strings) {
            k = 0;
            char[] charTemp = string.toCharArray();
            for (int i = 0; i < string.length() - 1; i++) {
                for (int j = i + 1; j < string.length(); j++) {
                    String str1 = String.valueOf(charTemp[i]), str2 = String.valueOf(charTemp[j]);
                    if (str1.equals(str2)) {
                        k++;
                    }
                }
            }
            if (k == 0) {
                String result = "";
                for (int l = 0; l < string.length(); l++) {
                    result = result.concat(String.valueOf(charTemp[l]));
                }
                System.out.println("Строка состоящая из различных символов:");
                System.out.println(result);
                break;
            }
        }
        if (k != 0) {
            System.out.println("Строка, состоящая из различных символов отсутствует");
        }

        System.out.println("----------------------------------------");
        System.out.println("Введите новую строку для дубливания символов:");
        String newString = scanner.nextLine();
        char[] charArray = newString.toCharArray();
        scanner.close();
        String string = "";
        for (char chr : charArray) {
            string = string.concat(String.valueOf(chr));
            string = string.concat(String.valueOf(chr));
        }
        System.out.println(string);
    }
}