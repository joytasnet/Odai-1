/*
   【問題003】
   下の図のように、整数を３つ入力すると、最も大きい整数と、
   最も小さい整数の差を表示する。

   【実行画面】
   整数1を入力 >>7【enterキー】
   整数2を入力 >>3【enterキー】
   整数3を入力 >>14【enterキー】
   最も大きい整数14と
   最も小さい整数3の差は11です。
   */
import java.util.*;
public class Q003{
	public static void main(String[] args){
		int[] numbers = new int[3];
		for(int i = 0; i<3; i++){
			System.out.print("整数"+(i+1)+"を入力>>");
			numbers[i] = new Scanner(System.in).nextInt();
		}
		int max = Math.max(numbers[0], Math.max(numbers[1],numbers[2]));
		int min = Math.min(numbers[0], Math.min(numbers[1],numbers[2]));
		int dif = max-min;
		System.out.printf("最も大きい整数%dと最も小さい整数%dの差は%dです。",max,min,dif);
	}
}
