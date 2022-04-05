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
		System.out.print("今年の年は?>>");
		int year = new Scanner(System.in).nextInt();
		System.out.print("今年の月は?>>");
		int month = new Scanner(System.in).nextInt();
		System.out.print("今年の日は?>>");
		int day = new Scanner(System.in).nextInt();
		System.out.print("誕生日の年は?>>");
		int birthday_year = new Scanner(System.in).nextInt();
		System.out.print("誕生日の月は?>>");
		int birthday_month = new Scanner(System.in).nextInt();
		System.out.print("誕生日の日は?>>");
		int birthday_day = new Scanner(System.in).nextInt();
		int age = year - birthday_year;
		if(month == birthday_month){
			if(day < birthday_day){
				age -= 1;
			}
		}else if(month < birthday_month){
			age -= 1;
		}
		System.out.printf("あなたの年齢は%dです。%n",age);
	}
}
