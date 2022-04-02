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
		int num;
		System.out.print("整数を入力>>");
		num=new Scanner(System.in).nextInt();
		if(num<=10&&num>=0){
			System.out.printf("%dは0以上10以下です。%n",num);
		}else{
			System.out.printf("%dは0以上10以下じゃないです。%n",num);
		}
	}
}
