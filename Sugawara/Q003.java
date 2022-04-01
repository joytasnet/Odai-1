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
		final int n =3;
		int[] nums = new int [n];

		int total =0;
		int min =0;
		int max =0;

		for(int i=0 ; i<n ; i++){
			System.out.printf("整数(%d)を入力>>",i+1);
			nums[i] = new Scanner(System.in).nextInt();
			min = nums[0];
			if(nums[i]>max){
				max = nums[i];
			}
			if(nums[i]<min){
				min = nums[i];
			}
		}
		System.out.printf("最も大きかった整数%dと%n最も小さかった整数%dの差は%dです%n",max,min,max-min);
	}
}
