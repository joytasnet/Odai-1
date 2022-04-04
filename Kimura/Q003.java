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
		final int COUNT = 3;//拡張性の高い、素晴らしい実装
		int[] nums = new int[COUNT];
		for(int i=0;i<COUNT;i++){
			System.out.printf("整数%sを入力>>",i+1);
			nums[i] =new Scanner(System.in).nextInt();
		}
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] > nums[j]){
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		System.out.printf("最も大きい整数%sと%n最も小さい整数%sの差は%sです。%n",nums[COUNT-1],nums[0],nums[COUNT-1]-nums[0]);
	}
}
