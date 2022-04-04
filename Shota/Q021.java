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
		int[] arrays=new int[5];
		for(int i=0; i<arrays.length;i++){
		int number= new Random().nextInt(21)+20;
		arrays[i]=number;
		}
		System.out.println(Arrays.toString(arrays));

		for(int i=0;i<arrays.length-1;i++){
			for(int j=i+1;j<arrays.length;j++){
				if(arrays[i]<arrays[j]){
					int temp =arrays[i];
					arrays[i]=arrays[j];
					arrays[j]=temp;
				}
			}
		}
		System.out.println(arrays[0]+">"+arrays[1]+">"+arrays[2]+">"+arrays[3]+">"+arrays[4]);

	}
}
