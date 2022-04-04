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
		String namesStr = new Scanner(System.in).nextLine();

		String[] names = namesStr.split(",");

		for(int i = 0; i < names.length - 1; i++) {
			int longInx = i;
			for(int j = i + 1; j < names.length; j++)
				if(names[j].length() >= names[longInx].length())
					longInx = j;
			String tmp = names[longInx];
			names[longInx] = names[i];
			names[i] = tmp;
		}

		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
	}
}
