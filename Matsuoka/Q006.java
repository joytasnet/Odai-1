/*
【問題006】
下の図のように、先頭の整数と末尾の整数を入力すると、その範囲の整数を表示する。

【実行画面1】
先頭の整数を入力>>5
末尾の整数を入力>>10
5 6 7 8 9 10
【実行画面2】
先頭の整数を入力>>3
末尾の整数を入力>>-2
3 2 1 0 -1 -2
【実行画面3】
先頭の整数を入力>>3
末尾の整数を入力>>3
3
*/
import java.util.*;
public class Q006{
	public static void main(String[] args){
		int num1,num2;
		System.out.print("先頭の整数を入力>>");
		num1=new Scanner(System.in).nextInt();
		System.out.print("末尾の整数を入力>>");
		num2=new Scanner(System.in).nextInt();
		int max=Math.max(num1,num2);
		int min=Math.min(num1,num2);
		for(int i=0;i<(max-min)+1;i++){
			if(num1==num2){
				System.out.printf("%d",num1);
				break;
			}else if(num1>num2){
				System.out.printf("%d ",num1);
				num1--;
			}else if(num1<num2){
				System.out.printf("%d ",num1);
				num1++;
			}

		}

	}
}
