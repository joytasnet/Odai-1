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
		System.out.print ("整数1を入力>>");
		int n1 = new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int n2 = new Scanner(System.in).nextInt();
		System.out.print("偶数(0)・奇数(1)を選択>>");
		int choice = new Scanner(System.in).nextInt();
		boolean isEven = choice == 0;

		if(n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		
		if(isEven && n1 % 2 != 0)
			n1++;
		else if(!isEven && n1 % 2 == 0)
			n1++;
		
		int sum = 0;
		for(int i = n1; i <= n2; i += 2)
			sum += i;

		System.out.println(n1 + "から" + n2 + "までの" + (isEven ? "偶数" : "奇数") + "の合計は" + sum + "です。");
	}
}
