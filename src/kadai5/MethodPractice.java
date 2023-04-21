package kadai5;
import java.util.Arrays;
import java.util.Calendar;
public class MethodPractice {
    public static void main(String[] args) {
//        //二分探索
//
//        //整数配列を定義している
//        int [] arr = {1,2,3,4,5,6,7,8};
//            //配列arrから値5を探索し、インデックスを取得
//            int index = getIndex(arr,5);
//            //結果を出力
//            System.out.println("5はインデックス " + index);
//        }
//        //二分探索を実行するメソッド
//        public static int getIndex(int[] arr, int value){
//            //配列の先頭と末尾のインデックスを引数として再利的に呼び出す
//            return binarySearch(arr, value, 0, arr.length-1);
//        }
//    //二分探索の再帰処理を行うメソッド
//    private static int binarySearch(int[] arr, int value, int left, int right){
//        //左端が右端を超えた場合、
//        if (left > right){
//            //要素が見つからなかったことを示し-1を返す
//            return  -1;
//        }
//        //配列の中央のインデックスを計算している
//        int mid = (left + right) / 2;
//        //中央の要素が探している値と一致した場合
//        if (arr[mid] == value){
//            //中央のインデックスを返す
//            return mid;
//        //中央の要素が探している値と一致した場合
//        } else if (arr[mid] > value)  {
//            //左半分を再帰的に探索
//            return binarySearch(arr, value, left,mid -1);
//        //中央の要素が探している値より小さい場合
//        } else {
//            //右半分を再帰的に探索
//            return binarySearch(arr, value, mid + 1, right);
//        }
//    }
//}

        //配列のソート
        //ソート前の配列
        int[] arr = {4,2,8,5,1,3,7,6};
        //配列をソートする
        arr = sortArray(arr);
        //ソート後の配列を表示する
        System.out.println(Arrays.toString(arr));
    }
    //配列をソートするメソッド
    public static int[] sortArray(int[] arr){
        //Java標準ライブラリであるArraysクラスを用いて、配列をソートする
        Arrays.sort(arr);
        //ソートされた配列を返す
        return arr;
    }
}

//        //年齢取得
//        int year = 2004;
//        int month = 6;
//        int day = 17;
//        int age = getAge(year, month, day);
//        System.out.println("現在の年齢は" + age + "　歳です。");
//    }
//
//    public static int getAge(int year, int month, int day) {
//        Calendar now = Calendar.getInstance();
//        int nowYear = now.get(Calendar.YEAR);
//        int nowMonth = now.get(Calendar.MONTH) + 1;
//        int nowDay = now.get(Calendar.DATE);
//        int age = nowYear - year;
//        if (month > nowMonth || (month == nowMonth && day > nowDay )){
//
//        }
//        return age;
//    }
//}

//      //回文
//        String str = "42824";
//        if (isPalindrome(str)){
//            System.out.println(str + "は回文です。");
//        } else {
//            System.out.println(str + "は回文ではありません。");
//        }
//    }
//    public static boolean isPalindrome(String str){
//        int length = str.length();
//        for (int i = 0; i < length / 2; i++){
//            if (str.charAt(i) != str.charAt(length - i - 1)){
//                return false;
//            }
//        }
//        return true;
//    }
//}
//        //配列の最大値
//            int [] arr = {4,3,8,6,2,};
//            int max = findMax(arr);
//            System.out.println("最大値は" + max + "です。");
//    }
//        public static int findMax(int[] arr){
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//        }
//}
//        //階乗
//        int n = 10;
//        int sum = factorial(n);
//            System.out.println(n + "の階乗は" + sum + "です。");
//        }
//            public static int factorial(int n){
//                if (n < 0){
//                    return 1;
//                }
//                int result = 1;
//                for (int i = 1; i <= n; i++){
//                    result *= i;
//                }
//                return result;
//    }
//}
//        //素数判定
//        int n = 5;
//        if (isPrime(n)) {
//            System.out.println(n + "は素数です。");
//        } else {
//            System.out.println(n + "は素数ではありません。");
//        }
//    }
//
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

//        //合計値
//        int n = -5;
//        int sum = getSum(n);
//        System.out.println("1から" + n + "までの合計は" + sum + "です。");
//
//
//        public static int getSum(int n){
//
//
//            int sum = 0;
//            for (int i = 1; i <= n; i++){
//                sum += i;
//            }
//            return sum;
//        }



//うるう年判定
//        int year = 2024;
//        if (isLeapYear(year)){
//            System.out.println(year + "年はうるう年です。");
//        } else {
//            System.out.println(year + "年はうるう年ではありません。");
//        }
//
//    }
//    public static boolean isLeapYear (int year){
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    return true;
//                } else {
//                    return false;
//                }
//            } else {
//                return true;
//            }
//        } else {
//            return false;
//        }
