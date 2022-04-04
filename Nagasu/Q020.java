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
		String input = new Scanner(System.in).nextLine();
		String[] datas = input.split(",");
		for(int i=0;i<datas.length-1;i++){
			for(int j=i+1;j<datas.length;j++){
				int numI = datas[i].length();
				int numJ = datas[j].length();
				if(numI < numJ){
					String temp = datas[i];
					datas[i] = datas[j];
					datas[j] = temp;
				}
			}
		}
		for(int i=0;i<datas.length;i++){
			System.out.println(datas[i]);
		}
	}
}
