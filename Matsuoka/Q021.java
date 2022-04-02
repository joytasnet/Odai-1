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
		int[] nums=new int[5];
		String[] nums2=new String[5];

		for(int i=0;i<5;i++){
			nums[i]=new Random().nextInt(11)+20;
			nums2[i]=Integer.toString(nums[i]);
		}
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<4;i++){
			for(int j=i+1;j<5;j++){
				if(nums[i]<nums[j]){
					int tmp;
					String nametmp;
					tmp=nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
					nametmp=nums2[i];
					nums2[i]=nums2[j];
					nums2[j]=nametmp;
				}
			}
		}
		String result=String.join(">",nums2);
		System.out.println(result);
		
	}
}
