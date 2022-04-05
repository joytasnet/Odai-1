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
		System.out.print("整数Aを入力>");
		int numA=new Scanner(System.in).nextInt();
		System.out.print("整数Bを入力>");
		int numB=new Scanner(System.in).nextInt();
		int min =Math.min(numA,numB);
		int max =Math.max(numA,numB);
		System.out.println(min +"から"+ max + "の偶数は ");
		for(int i = min;i<=max;i++){
			if(min<max){
				if(i%2==0){
					System.out.print(i + " ");
				}
			}				
		}
					System.out.print("です");


	}
}
