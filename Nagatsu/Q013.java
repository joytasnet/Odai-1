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
		int cy = new Scanner(System.in).nextInt();
		System.out.print("今日の月は？>>");
		int cm = new Scanner(System.in).nextInt();
		System.out.print("今日の日は？>>");
		int cd = new Scanner(System.in).nextInt();
		System.out.print("誕生日の年は？>>");
		int yy = new Scanner(System.in).nextInt();
		System.out.print("誕生日の月は？>>");
		int ym = new Scanner(System.in).nextInt();
		System.out.print("誕生日の日は？>>");
		int yd = new Scanner(System.in).nextInt();
		int old;
		if(cm>ym){
			old = cy - yy;
		}else if(cm==ym){
			if(cd>=yd){
				old = cy - yy;
			}else{
				old = cy - yy - 1;
			}
		}else{
				old = cy - yy - 1;
		}
		System.out.printf("あなたの年齢は%d歳です。",old);
	}
}
