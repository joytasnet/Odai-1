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
		String input=new Scanner(System.in).nextLine();

		String[] data=input.split(",");

		String max=data[0];
		String min=data[0];
		int maxB=Integer.parseInt(max);
		int minB=Integer.parseInt(min);
		for(int i=0; i<data.length;i++){
			int number=Integer.parseInt(data[i]); 
			if(number>maxB){
				maxB=number;
			}
			if(number<minB){
				minB=number;
			}
		}
		System.out.printf("最大値は%d,最小値は%d",maxB,minB);
	}
}
