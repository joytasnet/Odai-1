/*
【問題16】
1000円以上の金額を入力し、100円単位に丸めた状態で表示する
【実行例】
金額を入力>>15346
約15,300円です。
*/
import java.util.*;
public class Q016{
	public static void main(String[] args){
		System.out.print("1000円以上の金額を入力してください>>");
		int money = new Scanner(System.in).nextInt();

			if(money>=1000){
				double n = money/100;
				System.out.printf("約%.0f円です。%n",n*100);
			}else{
				System.out.print("1000円以上の金額を入力してください");
			}
	}
}
