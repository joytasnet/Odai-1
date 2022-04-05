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
		String namesA=new Scanner(System.in).nextLine();

		String[] arrays=namesA.split(",");

		for(int i=0; i<arrays.length;i++){
			for(int j=i+1; j<arrays.length;j++){
				if(arrays[i].length()<arrays[j].length()){
					String temp = arrays[i];
					arrays[i]=arrays[j];
					arrays[j]=temp;
				}	
			}	
			System.out.println(arrays[i]);
		}
	}
}


