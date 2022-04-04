/*
【問題11】
下の図のように、整数を入力すると、その整数が、0以上10以下であるかを判定する。

【実行画面】
整数を入力>>5
5は0以上10以下です。
*/
import java.util.*;
public class Q011{
	public static void main(String[] args){
		System.out.print("整数を入力>>");
		int input = new Scanner(System.in).nextInt();
		System.out.printf("%dは" + (input > 0 ? "0以上":"0以下") +
				(input > 10 ? "10以上":"10以下") + "です。%n",input);
		//System.out.printf("%dは",input);
		//System.out.printf(input > 0 ? "0以上":"0以下") ;
		//System.out.printf(input > 10 ? "10以上":"10以下" +"です。%n");
	}
}
