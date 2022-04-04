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
		System.out.println("名前を,区切りで入力>>");
		String name = new Scanner(System.in).nextLine();

		String[] names = name.split(",");
		for(int i=0 ; i<names.length ; i++){
			if(names.length()
		}
	}
}
