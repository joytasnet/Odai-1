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

		char[] data= words.toCharArray();
		String arrays=" ";
		for(int i=0; i<=data.length;i++){
			arrays+=data[data.length-1-i];
		}
		if(words .equals(arrays)){
			System.out.printf("[%s]は回文です。%n",words);
		}else{
			System.out.printf("[%s]は回文ではありません%n",words);
		}
	}
}
