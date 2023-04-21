/*

package kadai3;

import java.util.Scanner;

public class IfPractice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("得点を入力してください: ");
        float score = scanner.nextFloat();

        if (score >= 60) {
            System.out.println("合格です");
        } else {
            System.out.println("不合格です");
        }
    }
}

 */

package kadai3;

import java.util.Scanner;

public class IfPractice01sankouen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("得点を入力してください: ");
        float score = scanner.nextFloat();
        String message = (score >= 60) ? "合格です" : "不合格です";
        System.out.println(message);
    }
}

