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
		int num,sum=0;
		System.out.print("正の整数を入力してください>>");
		num=new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			sum+=i+1;
		}
		System.out.printf("%d",sum);
	}
}
