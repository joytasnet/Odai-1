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
		String name = new Scanner(System.in).nextLine();
		char[] data = name.toCharArray();
		boolean isCirculer = true;
		for(int i=0;i <= data.length/2;i++){
			if(data[i] == data[data.length-1-i]){
				isCirculer = true;
			}else{
				isCirculer = false;
				break;
			}
		}
		System.out.printf("[%s]は回文",name);
		if(isCirculer){
			System.out.println("です。");
		}else{
			System.out.println("ではありません。");
		}
	}
}
