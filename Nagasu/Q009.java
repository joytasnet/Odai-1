/*
【問題009】
下の図のように、2つの整数と偶数・奇数の選択を入力すると、その間の偶数か奇数の合計を表示する。
大小の逆入力や、負の数にも対応するようにする。

【実行画面】
整数1を入力>>-4
整数2を入力>>-9
偶数(0)・奇数(1)を選択>>0
-9から-4までの偶数の合計は-18です。
*/
import java.util.*;
public class Q009{
	public static void main(String[] args){
		System.out.print("整数1を入力>>");
		int in1 = new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int in2 = new Scanner(System.in).nextInt();
		System.out.print("偶数(0) 奇数(1)を選択>>");
		int evenodd = new Scanner(System.in).nextInt();
		int min = Math.min(in1,in2);
		int max = Math.max(in1,in2);
		int sum=0;
		switch(evenodd){
			case 0:
				for(int i=min;i<=max;i++){
					if(i%2 ==0){
						sum += i;
					}
				}
				break;
			case 1:
				for(int i=min;i<=max;i++){
					if(i%2 !=0){
						sum += i;
					}
				}
				break;
			default:
				System.out.println("偶数・奇数選択エラー");
				return;
		}
		System.out.printf("%dから%dまでの",min,max);
		System.out.printf((evenodd == 0 ? "偶数":"奇数") + "の合計は%dです%n",sum);
				
	}
}
