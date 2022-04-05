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
		int[] data0 = new int[21];
		int[] data = new int[5];
		for(int i=0;i<data0.length;i++){
			data0[i]=i+20;
		}
		for(int i=0;i<data0.length;i++){
			int index = new java.util.Random().nextInt(data0.length-i)+i;
			int tmp = data0[index];
			data0[index] = data0[i];
			data0[i] = tmp;
		}
		for(int i=0;i<data.length;i++){
			data[i] = data0[i];
		}
		System.out.println(Arrays.toString(data));
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]<data[j]){
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		for(int i=0;i<data.length-1;i++){
			System.out.print(data[i]+">");
		}
		System.out.println(data[data.length-1]);
	}
}
