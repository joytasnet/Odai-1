/*
【問題13】
下の図のように、今日の日付とある人の生年月日を入力すると、その人が現在何歳かを表示する。

【実行画面】
今日の年は？＞2022
今日の月は？＞4
今日の日は？＞1
誕生日の年は？＞2010
誕生日の月は？＞6
誕生日の日は？＞23
あなたの年齢は11歳です。
*/
import java.util.*;
public class Q013{
	public static void main(String[] args){
		System.out.print("今日の年は？>>");
		int today_y = new Scanner(System.in).nextInt();
		System.out.print("今日の月は？>>");
		int today_m = new Scanner(System.in).nextInt();
		System.out.print("今日の日は？>>");
		int today_d = new Scanner(System.in).nextInt();
		System.out.print("誕生日の年は？>>");
		int your_y = new Scanner(System.in).nextInt();
		System.out.print("誕生日の月は？>>");
		int your_m = new Scanner(System.in).nextInt();
		System.out.print("誕生日の日は？>>");
		int your_d = new Scanner(System.in).nextInt();
		//年齢測定
		int old = today_y - your_y;
		if(today_m < your_m){
			old--;
		}else if(today_m == your_m){
			if(today_d < your_d){
				old--;
			}
		}
		if(old < 0){
			old = 0;
		}
		System.out.printf("あなたの年齢は%d歳です。",old);
	}
}
