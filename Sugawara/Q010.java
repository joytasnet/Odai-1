/*
【問題10】
下の図に示すように数値を連続して入力し、
最後に0を入力すると、それまで入力された数値について
合計、平均を表示する。
平均は、整数値(小数点以下は切り捨て)

【実行画面】
数値の1を入力>>4
数値の2を入力>>7
数値の3を入力>>15
数値の4を入力>>3
数値の5を入力>>0
合計は29,平均は7です。
*/
import java.util.*;
public class Q010{
	public static void main(String[] args){
		final int n = 5;
		int[] nums = new int[n];
		for(int i=0 ; i<nums.length ; i++){
			System.out.printf("%dつ目の数値を入力して下さい>>%n",i+1);
			int user = new Scanner(System.in).nextInt();
			nums[i] = user;
		}
		int sum=0;
		int average=0;
		for(int i=0 ; i<nums.length ; i++){
			sum += nums[i];
		}
		average = sum/nums.length;
		System.out.printf("合計は%d,平均は%dです。%n",sum,average);
	}
}
