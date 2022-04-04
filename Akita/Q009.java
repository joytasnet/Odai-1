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
		int nA = new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int nB = new Scanner(System.in).nextInt();
		System.out.print("偶数(0)・奇数(1)を選択>>");
		int ans = new Scanner(System.in).nextInt();
		if(nA>nB){
			int temp =nA;
			nA = nB;
			nB = temp;
		}
		int sum =0;
		for(int i =nA;i<=nB;i++){
			sum +=(Math.abs(i%2)==ans?i:0);
		}
		System.out.printf("%dから%dまでの%sの合計は%dです。%n",nA,nB,(ans==0?"偶数":"奇数"),sum);
	}
}
