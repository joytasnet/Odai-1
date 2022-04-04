/*
【問題005】
下の図のように、整数を入力すると、その範囲の正の整数を表示する。

【実行画面】
整数を入力＞10【enterキー】
1 2 3 4 5 6 7 8 9 10 
*/
import java.util.*;
public class Q005{
	public static void main(String[] args){
		System.out.print("整数を入力>>");
		int input = new Scanner(System.in).nextInt();
		for(int i=0;i<input;i++){
			System.out.print((i+1)+" ");
		}
		System.out.println("");
	}
}
