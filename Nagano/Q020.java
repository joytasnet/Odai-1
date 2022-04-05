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
		System.out.print("名前をカンマ区切りで入力>");
		String name =new Scanner(System.in).next();
		String[] names =name.split(",");
		for(int i =0;i<names.length;i++){
			for(int j =i+1;j<names.length;j++){
				if(names[i].length()<names[j].length()){
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
			System.out.println(names[i]);
		}
	}
}
