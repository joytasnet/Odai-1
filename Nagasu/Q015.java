/*
【問題15】
正の整数を入力し、それが何桁の値なのかを出力する
【実行例1】
正の整数>>324
3桁の整数です
【実行例2】
正の整数>>183275
6桁の整数です
*/
import java.util.*;
public class Q015{
	public static void main(String[] args){
		System.out.print("正の整数>>");
		int input = new Scanner(System.in).nextInt();
		int len = Integer.toString(input).length();
		System.out.println(len + "桁の整数です");
	}
}
