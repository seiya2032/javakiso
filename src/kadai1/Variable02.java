package kadai1;

public class Variable02 {
    public static void main(String[] args){
        int num1 = 2735;
        int num2 = 1377;
        //num1の値を一時的に変数tempに代入
        int temp = num1;
        //num2の値をnum1に代入
        num1 = num2;
        //(num1の元の値)をnum2に代入
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
