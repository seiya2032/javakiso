package kadai3;

import java.util.Scanner;
public class SwitchPractice01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("信号の色を入力してください（赤、黄、青）: ");
        String color = scanner.nextLine();

        switch (color) {
            case "赤":
                System.out.println("赤ですね。進んではいけません。");
                break;
            case "黄":
                System.out.println("黄ですね。止まってください。");
                break;
            case "青":
                System.out.println("青ですね。進んでください。");
                break;
            default:
                System.out.println("赤、青、黄のいずれかを選択してください。");
                break;
        }
    }
}
