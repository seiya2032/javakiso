import java.util.Scanner;

public class MathPractice01 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        int square = num1 * num1;
        System.out.println(num1 + "の2乗は" + square + "です。");
    }
}