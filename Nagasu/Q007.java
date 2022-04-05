/*
【問題007】
下の図のように、正の整数を入力すると、
その数までの偶数を表示する。

【実行画面】
整数を入力>>11【enterキー】
2 4 6 8 10
*/
import java.util.*;
public class Q007{
	public static void main(String[] args){
		System.out.print("整数を入力>>");
		int input = new Scanner(System.in).nextInt();
		for(int i=2;i<=input;i+=2){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
