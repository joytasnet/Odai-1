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
		String input = new Scanner(System.in).nextLine();
		String[] datas = input.split(",");
		for(int i=0;i<datas.length-1;i++){
			for(int j=i+1;j<datas.length;j++){
				int numI = Integer.parseInt(datas[i]);
				int numJ = Integer.parseInt(datas[j]);
				if(numI < numJ){
					String temp = datas[i];
					datas[i] = datas[j];
					datas[j] = temp;
				}
			}
		}
		System.out.printf("最大値は%S,最小値は%s%n",datas[0],datas[datas.length-1]);
	}
}
