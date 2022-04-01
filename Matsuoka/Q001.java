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
		int a,b;
		System.out.print("整数1>>");
		a=new Scanner(System.in).nextInt();
		System.out.print("整数2>>");
		b=new Scanner(System.in).nextInt();
		int sum=a+b;
		System.out.printf("%dと%dの合計は%dです.",a,b,sum);
	}
}
