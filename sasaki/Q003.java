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
		int[] nums = new int[3];
		int max = 0;
		int min = 0;
		for(int i=1;i<=nums.length;i++){
			System.out.printf("整数%dを入力 >>",i);
			int num = new Scanner(System.in).nextInt();
			if(max < num){
				max = num;
			}else{
				min = num;
			}
		}
		System.out.printf("最も大きい整数%dと%n最も小さい整数%dの差は%dです。",max,min,max - min);
	}
}
