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
		String str = new Scanner(System.in).nextLine();

		char[] strs = str.toCharArray();
		int checker =0;

		for(int i=0 ; i<=strs.length/2 ; i++){
			if(strs[i] == strs[strs.length-i]){
				checker+=1;
			}
		}
			System.out.println(checker==strs.length/2 ? Arrays.toString(strs)+"は回文書です。" : Arrays.toString(strs)+"は回文書ではありません。");
	}
}
