package kadai2;
//Scannerクラスを使用するためにインポート
import java.util.Scanner;
public class MathPractice01 {
    public static void main(String[] args){
        //コマンドラインから入力を受け取るScannerオブジェクトを生成
        Scanner sc = new Scanner(System.in);
        //ユーザーに数値の入力を促すメッセージを表示
        System.out.println("数値を入力してください;");
        //ユーザーから入力された数値を読み取り、double型の変数numの代入
        double num = sc.nextDouble();
        //Math.pow()メソッドを使用して、numの2乗を計算し、resultに代入
        double result = Math.pow(num,2);
        //計算結果を出力
        System.out.println(num + "の2乗は" + result + "です。");
    }
}
