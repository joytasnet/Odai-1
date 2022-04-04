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
		int around =3;
		int[] numbers = new int[around];
		for(int i=0;i<numbers.length;i++){
			System.out.printf("整数%dを入力>>",i+1);
			numbers[i] = new Scanner(System.in).nextInt();
		}
		for(int i=0;i<numbers.length-1;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[i]<numbers[j]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.printf("最も大きい整数%dと%n",numbers[0]);
		System.out.printf("最も小さい整数%dの差は%dです。%n",
			numbers[numbers.length-1],numbers[0] - numbers[numbers.length-1]);
	}
}
