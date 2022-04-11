/*
【問題21】
20から40の乱数を5個作成する。
その結果を降順で>区切りで出力する
【実行例】
[31,4,25,38,2]
38>31>25>4>2
*/
import java.util.*;
public class Q021{
	public static void main(String[] args){
		int[] nums = new int[5];
		for(int i=0;i<nums.length;i++){
			nums[i] = new Random().nextInt(21)+20;
		}
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] < nums[j]){
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
			if(i!=0){
				if(nums[i-1] != nums[i]){
					System.out.print(">");
				}else{
					System.out.print("=");
				}
			}
			System.out.printf("%d",nums[i]);
		}
	}
}
