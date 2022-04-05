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
		String input = new Scanner(System.in).nextLine();
		boolean kaibun = true;
		char[] letters = input.toCharArray();
		for(int i=0;i<letters.length /2;i++){
			if(letters[i] != letters[letters.length -1 - i]){
				kaibun = false;
			}
		}
		//System.out.print(Arrays.toString(letters));
		System.out.printf("[%s]は回文" + 
				(kaibun ? "です。%n":"ではありません。%n"),input);
	}
}
