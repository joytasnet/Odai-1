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
		int[] ans = new int[3];
		System.out.print("整数1を入力 >>");
		int n1 = new Scanner(System.in).nextInt();
		System.out.print("整数2を入力 >>");
		ans[0] = n1;
		int n2 = new Scanner(System.in).nextInt();
		ans[1] = n2;
		System.out.print("整数3を入力 >>");
		int n3 = new Scanner(System.in).nextInt();
		ans[2] = n3;
		for(int i=0;i<ans.length-1;i++){
			for(int j=i+1;j<ans.length;j++){
				if(ans[i]<ans[j]){
					int temp=ans[i];
					ans[i]=ans[j];
					ans[j]=temp;
				}
			}
		}
		System.out.printf("最も大きい整数%dと%n最も小さい整数%dの差は%dです。%n",ans[0],ans[2],ans[0]-ans[2]);	
	}
}
