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
		int na = new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int nb = new Scanner(System.in).nextInt();
		int n1 = na;
		int n2 = nb;
		if(na>nb){
			n1 = nb;
			n2 = na;
		}
		System.out.print("偶数(0)・奇数(1)を選択>>");
		int nf = new Scanner(System.in).nextInt();
		int sum = 0;
		if(nf==0){
			for(int i=n1;i<=n2;i++){
				if(i%2==0){
					sum+=i;
				}
			}
			System.out.printf("%dから%dまでの偶数の合計は%dです。%n",n1,n2,sum);
		}
		if(nf==1){
			for(int i=n1;i<=n2;i++){
				if(i%2==1){
					sum+=i;
				}
			}
			System.out.printf("%dから%dまでの奇数の合計は%dです。%n",n1,n2,sum);
		}
	}
}
