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
		System.out.print("整数1を入力>>");
		int n1 = new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int n2 = new Scanner(System.in).nextInt();
		System.out.print("整数3を入力>>");
		int n3 = new Scanner(System.in).nextInt();
		int max = n1;
		int min = n1;
		if(max < n2){
			max = n2;
		}
		if(max < n3){
			max = n3;
		}
		if(min > n2){
			min = n2;
		}
		if(max > n3){
			min = n3;
		}
		System.out.printf("最も大きい整数%dと%n",max);
		System.out.printf("最も小さい整数%dの差は%dです。%n",min,max-min);
	}
}
