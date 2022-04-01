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
		System.out.print("整数1を入力>");
		int a =new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>");
		int b =new Scanner(System.in).nextInt();
		System.out.print("整数3を入力>");
		int c =new Scanner(System.in).nextInt();
		int[] num = {a,b,c};
		int max =num[0];
		int min =num[0];
		for(int i =0;i<num.length;i++){
			max=Math.max(max,num[i]);
			min=Math.min(min,num[i]);
		}
		System.out.println("最も大きい整数"+ max +"と");
		System.out.println("最も小さい整数"+ min +"との差は"+ (max-min) +"です");

	}
}
