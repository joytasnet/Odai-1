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
		System.out.print("受験人数(1～9人)を入力してください:");
		int student=new Scanner(System.in).nextInt();
		int score=-1;
		for(int i=0;i<student+4;i++){
			if(i<3||i>=student+3){
				for(int j=0;j<59;j++){
					if(i==1){
						System.out.print("■ 採点結果 一覧表");
						break;
					}else if(i==student+4){
						System.out.print(" ");
					}else if(i==student+3&&j+2==10){
						System.out.print("|");
					}else if(i==student+3&&(j+2)%10==0){
						System.out.print("+");
					}else{
						System.out.print("-");
					}
				}
			}
			if(i>2&&i<student+3){
				score=new Random().nextInt(50);
				System.out.printf("受験者%d |",i-2);
				for(int j=0;j<score;j++){
					System.out.print((j+1)%10==0?"+":"*");
					if(j==score-1){
						System.out.printf(" %d点",score);
					}
				}
			}
			System.out.println();
		}
			System.out.println("        0         10        20        30        40        50");
	}
}
