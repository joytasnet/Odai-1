/*
【問題008】
2つの整数を入力すると、その範囲の偶数を昇順で表示する。
2つの整数が大小逆に入力されても大丈夫なものにする。

【実行画面】
整数Aを入力>>20【enterキー】
整数Bを入力>>10【enterキー】
10から20の偶数は、
10 12 14 16 18 20 です
*/
import java.util.*;
public class Q008{
	public static void main(String[] args){
		int num1,num2;
		System.out.print("整数Aを入力>>");
		num1=new Scanner(System.in).nextInt();
		System.out.print("整数Bを入力>>");
		num2=new Scanner(System.in).nextInt();
		int min,max;
		min=Math.min(num1,num2);
		max=Math.max(num1,num2);
		for(int i=min;i<=max;i++){
			if(i%2==0){
				System.out.printf("%d ",i);
			}
		}
		System.out.println();
	}
}
