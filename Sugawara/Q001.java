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
		System.out.print("整数1>>");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("整数1>>");
		int num2 = new Scanner(System.in).nextInt();

		int sum = num1 + num2;
		System.out.printf("%dと%dの合計は%dです。%n",num1,num2,sum);
	}
}
