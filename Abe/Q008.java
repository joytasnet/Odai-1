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
		System.out.print("整数Aを入力>>");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("整数Bを入力>>");
		int num2 = new Scanner(System.in).nextInt();
		if(num1 >  num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.printf("%dから%dの偶数は、%n",num1,num2);
		if(num1 % 2 != 0){
			num1++;
		}
		for(int i = num1; i <= num2; i += 2){
			System.out.print(i + " ");
		}
		System.out.println("です");
	}
}
