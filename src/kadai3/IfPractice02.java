package kadai3;

import java.util.Scanner;

public class IfPractice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("得点を入力してください: ");
        int score = scanner.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("A評価です");
        } else if (score >= 60 && score < 80) {
            System.out.println("B評価です");
        } else if (score >= 40 && score < 60) {
            System.out.println("C評価です");
        } else if (score >= 20 && score < 40) {
            System.out.println("D評価です");
        } else if (score < 20) {
            System.out.println("E評価です");
        } else {
            System.out.println("入力された得点が不正です");
        }
    }
}