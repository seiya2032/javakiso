package kadai3;

import java.util.Scanner;

public class StringCompare01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の文字列を入力してください: ");
        String str1 = scanner.nextLine();

        System.out.print("2つ目の文字列を入力してください: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("入力値が一致しました");
        } else {
            System.out.println("入力値が一致しません");
        }
    }
}
