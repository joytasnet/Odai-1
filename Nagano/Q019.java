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
		String num =new Scanner(System.in).nextLine();
		int max =0;
		int min =0;
		String[] data=num.split(",");
		for(int i =0;i<data.length;i++){
			int n = Integer.parseInt(data[i]);
			if(max<n){
				max=n;
			}else if(min>n){
				min=n;
			}
		}
		System.out.println("最大値は"+ max + ",最小値は"+min);
	}
}	
