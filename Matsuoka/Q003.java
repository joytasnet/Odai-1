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
		int num1,num2,num3;
		System.out.printf("整数1を入力>>");
		num1=new Scanner(System.in).nextInt();
		System.out.printf("整数2を入力>>");
		num2=new Scanner(System.in).nextInt();
		System.out.printf("整数3を入力>>");
		num3=new Scanner(System.in).nextInt();
		Math.min(Math.min(num1,num2),num3);
		Math.max(Math.max(num1,num2),num3);
		System.out.printf("最も大きい整数%dと最も小さい整数%dの差は%dです。",Math.max(Math.max(num1,num2),num3),Math.min(Math.min(num1,num2),num3),Math.max(Math.max(num1,num2),num3)-Math.min(Math.min(num1,num2),num3));

	}
}
