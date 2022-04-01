/*
【問題003】
下の図のように、整数を３つ入力すると、最も大きい整数と、
最も小さい整数の差を表示する。

【実行画面】
整数1を入力 >>7【enterキー】
整数2を入力 >>3【enterキー】
整数3を入力 >>14【enterキー】
最も大きい整数14と
最も小さい整数3の差は11です。
*/
import java.util.*;
public class Q003{
	public static void main(String[] args){
		System.out.print("整数1を入力");
		int number1=new Scanner(System.in).nextInt();
		System.out.print("整数2を入力");
		int number2=new Scanner(System.in).nextInt();
		System.out.print("整数3を入力");
		int number3=new Scanner(System.in).nextInt();

			int max = Math.max(number1,Math.max(number2,number3));
			int min = Math.min(number1,Math.min(number2,number3));
			int ans =max-min;


		System.out.printf("最も大きい整数%d%n最も小さい整数%dの差は%dです。",max,min,ans);
	}
}
