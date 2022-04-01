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
		int start = new Scanner(System.in).nextInt();
		System.out.print("末尾の整数を入力>>");
		int end = new Scanner(System.in).nextInt();
		int sum = Math.max(start,end) - Math.min(start,end)+1;
		if(sum<0){
			sum*=(-1);
		}

		int[] numbers = new int[sum];
		if(end<0){
			for(int i=0 ; i<numbers.length ; i++){
				numbers[i]=start-i;
			}
		}else{
			for(int i=0 ; i<numbers.length ; i++){
				numbers[i]=start+i;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}
