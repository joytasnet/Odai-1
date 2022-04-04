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
		String money = new Scanner(System.in).next();
		char[] moneys = money.toCharArray();

			if(moneys[moneys.length-1]>=5){
				moneys[moneys.length-2]+=1;
				moneys[moneys.length-1]=0;
				moneys[moneys.length]=0;
			}else{
				moneys[moneys.length-1]=0;
				moneys[moneys.length]=0;
			}
		}
		System.out.println(Arrays.toString(moneys));
		int answer = 0;
		for(;;){
			Integer.parseInt(moneys[i]);
		}
	}
}
