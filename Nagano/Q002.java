/*
 【問題002】
下図のように、正の整数を入力すると1から
その整数までの合計を表示する。

【実行画面】
正の整数を入力してください。＞>10【enterキー】
1 から 10 までの合計は、 55 です。
*/
import java.util.*;
public class Q002{
	public static void main(String[] args){
		System.out.print("正の整数を入力してください>");
		int num =new Scanner(System.in).nextInt();
		int[] nums = new int[num];
		int sum = 0;
		for(int i =0;i<num;i++){
			sum+=i+1;
		}
		System.out.println("1から "+ num +"までの合計は"+ sum + "です");
	}
}
