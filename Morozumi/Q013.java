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
		int[] today = new int[3];
		System.out.print("今年は何年ですか？>>");
		today[0] = new Scanner(System.in).nextInt();
		System.out.print("今は何月ですか？>>");
		today[1] = new Scanner(System.in).nextInt();
		System.out.print("今日は何日ですか？>>");
		today[2] = new Scanner(System.in).nextInt();

		int[] birthday = new int[3];
		System.out.print("生まれた年は？>>");
		birthday[0] = new Scanner(System.in).nextInt();
		System.out.print("誕生月は？>>");
		birthday[1] = new Scanner(System.in).nextInt();
		System.out.print("誕生した日は？>>");
		birthday[2] = new Scanner(System.in).nextInt();

		int age = 0;
		age = today[0]-birthday[0];
		if(today[1] < birthday[1]){
			age -= 1;
		}else if((today[1] == birthday[1]) && (today[2] < birthday[2])){
			age -= 1;
		}else{
		}
		System.out.printf("あなたの年齢は%d歳です。%n",age);
	}
}
