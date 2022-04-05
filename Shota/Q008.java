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
		int numberA=new Scanner(System.in).nextInt();
		System.out.print("整数Bを入力>>");
		int numberB=new Scanner(System.in).nextInt();

		if(numberA>numberB){
			for(int i=numberB; i<numberA+1;i++){
				if(i%2 ==0){
				System.out.print(i+" ");
				}
			}
		}else{
			for(int i=numberA; i<numberB+1;i++){
				if(i%2 == 0){
				System.out.print(i+" ");
				}
			}	
		}
	}
}
