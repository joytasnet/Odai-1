/*
【問題19】
カンマ区切りで数値を入力してもらい、その数値の中の最大値、最小値を表示する
処理を作成せよ。
【実行例】
数値をカンマ区切りで入力>>3,5,1,9,1
最大値は9,最小値は1
*/
import java.util.*;
public class Q019{
	public static void main(String[] args){
		System.out.print("整数をカンマ区切りで入力>>");
		String str = new Scanner(System.in).nextLine();
		String[] numsS = str.split(",");
		int[] nums = new int[numsS.length];
		for(int i=0;i<numsS.length;i++){
			nums[i] = Integer.parseInt(numsS[i]);
		}
		for(int i=0 ;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]<nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.printf("最大値は%d,最小値は%d%n",nums[0],nums[nums.length-1]);
	}
}
