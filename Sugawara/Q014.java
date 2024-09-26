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
		System.out.print("受験人数(1～人)を入力してください：");
		int n = new Scanner(System.in).nextInt();
		int[] scores = new int[n];

		System.out.println("------------------------------------------------------------");
		System.out.println("    ■採点結果 一覧表");
		System.out.println("------------------------------------------------------------");
		for(int i=0 ; i<scores.length ; i++){
			scores[i] = new Random().nextInt(51);
			System.out.printf("受験者%d  |",i+1);
			for(int j=0 ; j<scores[i] ;j++){
				if(j%10==0){
					System.out.print("+");
				}else{
					System.out.print("*");
				}
			}
			System.out.printf(" %d点%n",scores[i]);
		}
		System.out.println("---------|---------+---------+---------+---------+---------+");
		System.out.println("         0        10        20        30        40        50");
	}
}
