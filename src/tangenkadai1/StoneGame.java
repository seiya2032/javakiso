package tangenkadai1;

import java.util.Scanner;
public class StoneGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("石取りゲームを開始します。");
        System.out.println("石の総数 : 25個");
        System.out.println("1度に取れる石の数： 3個");
        System.out.println("---------------------------");
        System.out.println("残り ： 25個");
        System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●");

        int i=25;

        while (i > 1){



        while ( i > 1 ){

            System.out.println();
            System.out.println("---------------------------");
        System.out.println("プレイヤーAの番");
        System.out.println("石の数を入力してください。　(1~3まで入力可能です。)");
        String num = scanner.nextLine();

        switch (num){
            case "1" -> System.out.println("1");
            case "2" -> System.out.println("2");
            case "3" -> System.out.println("3");
            default -> System.out.println("1、2、3のいずれかを選択してください。");
        }
            var num1 = Integer.parseInt(num);
            int c = i - num1;
            System.out.println("残り ：" + c + " 個 " );
            for (var j = 0; j < c ; j++){
                System.out.print("●");
            }
            i = c;
            break;
        }

            while (i > 1){

            System.out.println();
            System.out.println("---------------------------");
            System.out.println("プレイヤーBの番");
            System.out.println("石の数を入力してください。　(1~3まで入力可能です。)");
            String num2 = scanner.nextLine();

        switch (num2){
            case "1" -> System.out.println("1");
            case "2" -> System.out.println("2");
            case "3" -> System.out.println("3");
            default -> System.out.println("1、2、3のいずれかを選択してください。");
        }
            var num3 = Integer.parseInt(num2);
            int c = i - num3;
        System.out.println("残り ：" + c + " 個 " );
        for (var j = 0; j < c ; j++){
            System.out.print("●");
        }
        i = c;
                break;
            }

    }
        System.out.println("勝者 : A");
        System.out.println("勝者 : B");
    }
}
