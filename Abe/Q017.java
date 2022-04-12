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
		Scanner scan = new Scanner(System.in);

		System.out.print("文字列>>");
		String str = new Scanner(System.in).nextLine();

		char[] arr = str.toCharArray();
		boolean isPalindrome = true;
		for(int i = 0; i < arr.length / 2; i++)
			if(arr[i] != arr[arr.length - i - 1]) {
				isPalindrome = false;
				break;
			}
		
		if(isPalindrome)
			System.out.println("[" + str + "]は回文です。");
		else
			System.out.println("[" + str + "]は回文ではありません。");
	}
}
