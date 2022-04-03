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
		System.out.print("今年の西暦>");
		int nowY= new Scanner(System.in).nextInt();
		System.out.print("今は何月>");
		int nowM= new Scanner(System.in).nextInt();
		System.out.print("今日は何日>");
		int nowD= new Scanner(System.in).nextInt();
		System.out.print("生まれた年>");
		int birthY= new Scanner(System.in).nextInt();
		System.out.print("生まれた月>");
		int birthM= new Scanner(System.in).nextInt();
		System.out.print("生まれた日>");
		int birthD= new Scanner(System.in).nextInt();
		if(nowM>birthM){
			System.out.println("あなたの年齢は"+ (nowY - birthY) +"歳です");
		}else if(nowM==birthM && nowD >= birthD){
			System.out.println("あなたの年齢は"+ (nowY - birthY) +"歳です");
		}else if(nowM==birthM && nowD < birthD){
			System.out.println("あなたの年齢は"+ ((nowY - birthY)-1) +"歳です");
		}else if(nowM<birthM){
			System.out.println("あなたの年齢は"+ ((nowY - birthY) -1) +"歳です");
		}
	}
}
