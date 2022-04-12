/*
【問題14】
受験人数(1～9人)を入力させる。
各受験生の点数をランダムに発生させ、採点結果を一覧表示する。
点数は0~50とする。

【実行画面】
■ 受験人数（1～9人）を入力してください：5

------------------------------------------------------------
		■ 採点結果 一覧表
------------------------------------------------------------
 受験者1 |*********+*********+*********+***** 35点
 受験者2 |*********+*********+***** 25点
 受験者3 |*********+*********+*********+*********+***** 45点
 受験者4 |*********+*********+*********+****** 36点
 受験者5 |* 1点
---------|---------+---------+---------+---------+---------+
         0        10        20        30        40        50
*/
import java.util.*;
public class Q014{
	public static void main(String[] args){
Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("■受験人数（1～9人）を入力してください：");
		int nCandidates = new Scanner(System.in).nextInt();

		for(int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		System.out.println("\t\t■採点結果 一覧表");
		for(int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		for(int i = 0; i < nCandidates; i++) {
			System.out.print(" 受験者" + (i + 1) + " |");
			int nPoints = rand.nextInt(51);
			String points = "";
			for(int j = 0; j < nPoints; j++) {
				if((j + 1) % 10 == 0) points += "+";
				else points += "*";
			}
			System.out.println(points + " " + nPoints + "点");
		}
		for(int i = 0; i < 60; i++) {
			if((i + 1) == 10) 
				System.out.print("|");
			else if((i + 1) % 10 == 0)
				System.out.print("+");
			else
				System.out.print("-");
		}
		System.out.println();
		for(int i = 0; i < 6; i++) {
			System.out.print("        ");
			if(i == 0)
				System.out.print(" 0");
			else
				System.out.print((i * 10) + "");
		}
		System.out.println();
	}

}
