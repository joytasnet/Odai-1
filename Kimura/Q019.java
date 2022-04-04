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
		System.out.print("数値をカンマ区切りで入力>>");
		String inp = new Scanner(System.in).nextLine();

		String[] words = inp.split(",");
		int[] nums = new int[words.length];
		int max =0, min =0;
		for(int i=0;i<nums.length;i++){
			nums[i] = Integer.parseInt(words[i]);
			if(i==0){
				max = nums[i];
				min = nums[i];
			}else{
				if(nums[i]>max){
					max = nums[i];
				}
				if(nums[i]<min){
					min = nums[i];
				}
			}
		}
		System.out.printf("最大値は%d,最小値は%d%n",max,min);
	}
}
