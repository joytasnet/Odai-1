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
		int month,bMonth,today,birthday,old,bYear,day,bDay;
		System.out.print("今日の年は？>>");
		old=new Scanner(System.in).nextInt();
		System.out.print("今日の月は？>>");
		month=new Scanner(System.in).nextInt();
		System.out.print("今日の日は？>>");
		day=new Scanner(System.in).nextInt();
		System.out.print("誕生日の年は？>>");
		bYear=new Scanner(System.in).nextInt();
		old-=bYear;
		System.out.print("誕生日の月は？>>");
		bMonth=new Scanner(System.in).nextInt();
		System.out.print("誕生日の日は？>>");
		bDay=new Scanner(System.in).nextInt();
		today=month*100+day;
		birthday=bMonth*100+bDay;
		if(today<birthday){
			old--;
		}
		System.out.printf("あなたの年齢は%d歳です.%n",old);
	}
}
