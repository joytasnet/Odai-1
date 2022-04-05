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
		int min,max;
		String num=new Scanner(System.in).nextLine();
		String[] nums=num.split(",");
		int[] nums2=new int[nums.length];
		nums2[0]=Integer.parseInt(nums[0]);
		min=nums2[0];
		max=nums2[0];
		for(int i=0;i<nums2.length;i++){
			nums2[i]=Integer.parseInt(nums[i]);
			if(nums2[i]>max){
				max=nums2[i];
			}
			if(nums2[i]<min){
				min=nums2[i];
			}
		}
		System.out.printf("最大値は%d,最小値は%d%n",max,min);
	}
}
