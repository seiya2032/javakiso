package kadai2;
import java.util.Scanner;
public class MathPractice02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("数値を入力してください：");
        double num = sc.nextDouble();
        double result = Math.sqrt(num);
        System.out.println(num + "平方根は" + result + "です。");
    }
}
