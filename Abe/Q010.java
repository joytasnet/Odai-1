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
		int sum = 0;
		int nInputs = 0;
		int num;

		while(true) {
			System.out.print("整数の" + (nInputs + 1) + "を入力>>");
			num = new Scanner(System.in).nextInt();
			if(num == 0) {
				break;
			}
			sum += num;
			nInputs++;
		}
		System.out.println("合計は" + sum + ",平均は" + (sum / nInputs) + "です。");
	}
}
