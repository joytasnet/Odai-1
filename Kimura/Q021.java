/*
【問題20】
20から40の乱数を5個作成する。
その結果を降順で>区切りで出力する
【実行例】
[31,4,25,38,2]
38>31>25>4>2
*/
import java.util.*;
public class Q021{
	public static void main(String[] args){
		final int COUNT = 5;
		int[] nums= new int[COUNT];

		for(int i=0;i<COUNT;i++){
			nums[i] = new Random().nextInt(21)+20;
		}
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] < nums[j]){
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
			System.out.printf("%d>",nums[i]);
		}
		System.out.println(nums[nums.length-1]);
	}
}
