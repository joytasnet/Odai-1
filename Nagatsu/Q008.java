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
		int na = new Scanner(System.in).nextInt();
		System.out.print("整数Bを入力>>");
		int nb = new Scanner(System.in).nextInt();
		int n1 = na;
		int n2 = nb;
		if(na>nb){
			n1 = nb;
			n2 = na;
		}
		System.out.printf("%dから%dの偶数は、",n1,n2);
		for(int i=n1;i<=n2;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		System.out.println("です");
	}
}
