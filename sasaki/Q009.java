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
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int num2 = new Scanner(System.in).nextInt();
		System.out.print("偶数(0)・奇数(1)を選択>>");
		int select = new Scanner(System.in).nextInt();
		int sum = 0;
		if(select == 0){
			if(num1 < num2){
				System.out.printf("%dから%dまでの偶数の合計は",num1,num2);
				for(int i=num1;i<=num2;i++){
					if(i%2==0){
						sum += i;
					}
				}
			}else{
				System.out.printf("%dから%dまでの偶数の合計は",num2,num1);
				for(int i=num2;i<=num1;i++){
					if(i%2==0){
						sum += i;
					}
				}
			}
		}else if(select == 1){
			if(num1 < num2){
				System.out.printf("%dから%dまでの奇数の合計は",num1,num2);
				for(int i=num1;i<=num2;i++){
					if(i%2!=0){
						sum += i;
					}
				}
			}else{
				System.out.printf("%dから%dまでの奇数の合計は",num2,num1);
				for(int i=num2;i<=num1;i++){
					if(i%2!=0){
						sum += i;
					}
				}
			}
		}else{
			System.out.println("偶数か奇数を選んで下さい。");
		}
		System.out.printf("%dです.",sum);
	}
}
