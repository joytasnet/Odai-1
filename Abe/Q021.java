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
		int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++)
			nums[i] = new Random().nextInt(21) + 20;

		System.out.print("[" + nums[0]);
		for(int i = 1; i < nums.length; i++){
			System.out.print("," + nums[i]);
		}
		System.out.println("]");

		for(int i = 0; i < nums.length - 1; i++) {
			int maxInx = i;
			for(int j = i + 1; j < nums.length; j++){
				if(nums[j] > nums[maxInx])
					maxInx = j;
			}
			int tmp = nums[maxInx];
			nums[maxInx] = nums[i];
			nums[i] = tmp;
		}

		System.out.print(nums[0] + "");
		for(int i = 1; i < nums.length; i++){
			System.out.print(">" + nums[i]);
		}
		System.out.println();
	}
}
