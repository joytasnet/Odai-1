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
		System.out.print("数値の1を入力>");
		int a =new Scanner(System.in).nextInt();
		System.out.print("数値の2を入力>");
		int b =new Scanner(System.in).nextInt();
		System.out.print("数値の3を入力>");
		int c =new Scanner(System.in).nextInt();
		System.out.print("数値の4を入力>");
		int d =new Scanner(System.in).nextInt();
		System.out.print("最後に0を入力>");
		int e =new Scanner(System.in).nextInt();
		int sum = 0;
		int[] nums =new int[] {a,b,c,d};
		for(int i =0;i<nums.length;i++){
			sum+=nums[i];
		}
		if(e == 0){
			int avg =sum/nums.length;
			System.out.println("合計は"+ sum + ",平均は"+ avg +"です");
		}
	}
}
