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
		System.out.print("正の整数を入力>>");
		int n = new Scanner(System.in).nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++){
			nums[i] = i+1;
			if((nums[i]%2 == 0) || (nums[i]%3 == 0)){
				System.out.printf("%d ",nums[i]);
			}
		}
		System.out.println();
	}
}
