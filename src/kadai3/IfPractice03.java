package kadai3;

import java.util.Scanner;

public class IfPractice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください: ");
        int num = scanner.nextInt();

        if (num >= 60 && num % 2 == 0) {
            System.out.println(num);
        }
    }
}