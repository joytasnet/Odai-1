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
		System.out.print("■受験人数(1～9人)を入力してください: ");
		int input = new Scanner(System.in).nextInt();
		//一覧表作成//
		for(int i=0;i<60;i++){
			System.out.printf(i == 59 ? "-%n":"-");
		}
		System.out.println("     ■採点結果　一覧表");
		for(int i=0;i<60;i++){
			System.out.printf(i == 59 ? "-%n":"-");
		}
		//明細部分
		for(int i=0;i<input;i++){
			System.out.printf(" 受験者%d |",i+1);
			int point = new Random().nextInt(51);
			for(int j=1;j<point+1;j++){
				System.out.printf(j%10 ==0 ? "+":"*");
			}
			System.out.printf(" %d点%n",point);
		}

		//一覧表下部
		for(int i=1;i<61;i++){
			if(i%10 ==0){
				System.out.print(i==10 ? "|":"+");
			}else{
				System.out.print("-");
			}
		}
		System.out.println();
		for(int i=1;i<11;i++){
			System.out.printf(i==10 ? "0":" ");
		}
		for(int i=1;i<6;i++){
			for(int j=1;j<10;j++){
				System.out.printf(j==9 ? "%d0":" ",i);
			}
		}
		System.out.println();
	}
}
