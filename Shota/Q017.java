/*
【問題17】
文字を入力し、それが回文かどうかを判定する。
なお、文字列からchar型の配列には以下の方法で変換できる
String fruits="apple";
char[] data=fruits.toCharArray(); //[a, p, p, l, e]

【実行例1】
文字列>>しんぶんし
[しんぶんし]は回文です。
【実行例2】
文字列>>きのこ
[きのこ]は回文ではありません。

*/
import java.util.*;
public class Q017{
	public static void main(String[] args){
		System.out.print("文字列>>");
		String words=new Scanner(System.in).nextLine();

		char[] data=words.toCharArray();
		char[] data2=words.toCharArray();
		for(int i=data2.length-1;i>=0;i--){
		}
		char[] data3=data2[i];
		if(words.length()%2!=0){
			if(data==data3){
				System.out.println(data.charAt()+"は回文です。");
			}else{
				System.out.println(data.charAt()+"は回文ではありません");
			}
		}else{			
			System.out.println(words.charAt()+"は回文ではありません");
		}
	}
}
