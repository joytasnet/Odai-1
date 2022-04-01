/*
【問題001】
下の図のように、２つの整数を入力すると、その合計を表示する。

【実行画面】
２つの整数を入力してください。
整数1 >>7【enterキー】
整数2 >>5【enterキー】

7 と 5 の合計は 12 です。
*/
import java.util.*;
public class Q001{
	public static void main(String[] args){
	
	System.out.println("２つの整数を入力してください。");
	System.out.print("整数1>");
	int one =new Scanner(System.in).nextInt();
	System.out.print("整数2>");
	int two =new Scanner(System.in).nextInt();
	System.out.println(one + two + "の合計は"+ (one + two) + "です");
	}
}
