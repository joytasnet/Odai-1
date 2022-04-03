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
		System.out.print("整数を入力>");
		int num =new Scanner(System.in).nextInt();
		if(num>=0 && num<=10){
			System.out.println(num + "は0以上10以下です");
		}else{
			System.out.println(num + "は0以上10以下ではありません");
		}
	}
}
