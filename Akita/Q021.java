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
		int n =5;
		int[] data = new int[n];
		for(int i=0;i<n;i++){
			data[i]= new Random().nextInt(21)+20;
		}
		System.out.println(Arrays.toString(data));
		for(int i=0 ;i<data.length;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]<data[j]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			System.out.print(data[i]+(i<data.length-1?">":""));
		}
		System.out.println();
	}
}
