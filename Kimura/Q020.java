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
		String inp = new Scanner(System.in).next();
		String[] words = inp.split(",");
		for(int i=0;i<words.length-1;i++){
			for(int j=i+1;j<words.length;j++){
				if(words[i].length() < words[j].length()){
					String temp = words[j];
					words[j] = words[i];
					words[i] = temp;
				}
			}
			System.out.println(words[i]);
		}
		System.out.println(words[words.length-1]);
	}
}
