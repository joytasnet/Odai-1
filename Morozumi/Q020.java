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
		String name  = new Scanner(System.in).nextLine();

		String[] names = name.split(",");
		int[] nameInt = new int[names.length];

		for(int i=0; i<names.length; i++){
			nameInt[i] = names[i].length();
		}//名前の文字数がnameIntに格納される


		for(int i=0; i<names.length; i++){
			for(int j=i+1; j<names.length; j++){
				if(names[i].length() < names[j].length()){
					String temp = names[j];
					names[j] = names[i];
					names[i] = temp;
				}
			}
			System.out.print(names[i]);
			System.out.println();
		}
	}
}
