package kadai1;

public class Variable03 {
    public static void main(String[] args){
        int i = 1000_000_0;
        long l = 1000_000_000_0L;//long型の値を代入する場合、値の最後にLを付ける必要があります。
        float f = 100.0f;        // float型の値を代入する場合、値の最後にfを付ける必要があります。
        double d = 10000.0;

        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
