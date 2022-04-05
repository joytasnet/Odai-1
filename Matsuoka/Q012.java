/*
【問題12】
下の図のように正の整数を入力すると、1からその整数までで、
2の倍数であるか3の倍数であるものをすべて表示する。

【実行画面】
正の整数を入力>>10
2 3 4 6 8 9 10
*/
import java.util.*;
public class Q012{
	public static void main(String[] args){
		int num;
		System.out.print("正の整数を入力>>");
		num=new Scanner(System.in).nextInt();
		for(int i=1;i<=num;i++){
			if(i%2==0||i%3==0){
				System.out.printf("%d ",i);
			}
		}
		System.out.println();
	}
}
