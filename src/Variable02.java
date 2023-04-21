public class Variable02 {
    public static void main(String[] args) {
        int num1 = 2735;
        int num2 = 1377;

        int temp = num1;  // num1の値を一時的にtemp変数に保存する
        num1 = num2;      // num1にnum2の値を代入する
        num2 = temp;      // num2にtemp変数の値を代入する

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}