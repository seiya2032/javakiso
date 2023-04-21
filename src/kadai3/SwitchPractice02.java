package kadai3;

import java.util.Scanner;
public class SwitchPractice02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("信号の色を入力してください（品川、田町、浜松町、新橋）: ");
        String color = scanner.nextLine();

        switch (color) {
            case "品川":
                System.out.println("東京まで 田町 浜松町 新橋 有楽町 を通過します");
                break;
            case "田町":
                System.out.println("東京まで 浜松町 新橋 有楽町 を通過します");
                break;
            case "浜松町":
                System.out.println("東京まで 新橋 有楽町 を通過します");
                break;
            case "新橋":
                System.out.println("東京まで 有楽町 を通過します");
                break;
        }
    }
}
