package kadai2;
import java.util.Scanner;
public class MathPractice03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("数値を入力してください：");
        double num = sc.nextDouble();
        double result = Math.abs(num);
        System.out.println(num + "の絶対値は" +  result + "です。");
    }
}
