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
		for(int i =0;i<3;i++){
		System.out.printf("整数%dを入力>>",i+1);
		nums[i] = new Scanner(System.in).nextInt();
		}
		for(int i=0 ;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]>nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.printf("最も大きい整数%dと%n",nums[nums.length-1]);
		System.out.printf("最も小さい整数%dの差は%dです。%n",nums[0],nums[nums.length-1]-nums[0]);
	}
}
