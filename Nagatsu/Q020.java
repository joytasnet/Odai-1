/*
【問題20】
名前をカンマ区切りで入力。
それを名前の文字数の多い順に表示する。
【実行例】
名前をカンマ区切りで入力>>John,Paul,Ringo,George
George
Ringo
John
Paul
*/
import java.util.*;
public class Q020{
	public static void main(String[] args){
		System.out.print("名前をカンマ区切りで入力>>");
		String str = new Scanner(System.in).nextLine();
		String[] names = str.split(",");
		int[] nums = new int[names.length];
		for(int i=0;i<names.length;i++){
			nums[i] = names[i].length();
		}
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]<nums[j]){
					int temp1=nums[i];
					nums[i]=nums[j];
					nums[j]=temp1;
					String temp2=names[i];
					names[i]=names[j];
					names[j]=temp2;
				}
			}
		}
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}
}
