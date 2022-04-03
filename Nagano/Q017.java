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
		System.out.print("文字列を入力>");
		String word =new Scanner(System.in).next();
		char[] data=word.toCharArray();
		char[] compare=word.toCharArray();
		for(char i=0;i<data.length/2;i++){
			char tmp = data[i];
			data[i] = data[data.length-1-i];
			data[data.length-1-i] = tmp;
		}
		String data2 =new String(data);
		if(data2.equals(word)){
			System.out.println(word +"は回文です");
		}else{
			System.out.println(word +"は回文ではありません");
		}
		System.out.println();
	}
}
