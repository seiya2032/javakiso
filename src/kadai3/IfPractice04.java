package kadai3;

import java.util.Scanner;
public class IfPractice04 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("西暦を入力してください: ");
            int year = scanner.nextInt();

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("閏年です");
            }
        }
    }


