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
		int round = 5;
		int[] numbers = new int[round];
		for(int i=0;i<numbers.length;i++){
			numbers[i] = new Random().nextInt(20) +20;
		}
		System.out.println(Arrays.toString(numbers));
		for(int i=0;i<numbers.length-1;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[i] < numbers[j]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for(int i=0;i<numbers.length;i++){
			System.out.printf(numbers[i] + (i == numbers.length-1 ? "%n":">"));
		}
	}
}
