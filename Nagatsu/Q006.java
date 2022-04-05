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
		System.out.print("先頭の整数を入力>>");
		int n1 = new Scanner(System.in).nextInt();
		System.out.print("末尾の整数を入力>>");
		int n2 = new Scanner(System.in).nextInt();
		if(n1<=n2){
			for(int i=n1;i<=n2;i++){
				System.out.print(i+" ");
			}
		}else{
			for(int i=n1;i>=n2;i--){
				System.out.print(i+" ");
			}
		}
	}
}
