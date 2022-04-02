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
		String name;
		int count=0;
		System.out.print("文字列を入力>>");
		name=new Scanner(System.in).nextLine();
		char[] names=name.toCharArray();
		for(int i=0;i<name.length()/2;i++){
			if(names[i]==(names[(name.length()-1)-i])){
				count++;
			}
		}
		System.out.printf("%sは%s%n",name,count==name.length()/2?"回文です":"回文じゃないです");
	}
}
