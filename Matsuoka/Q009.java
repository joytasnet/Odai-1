/*
	 【問題009】
	 下の図のように、2つの整数と偶数・奇数の選択を入力すると、その間の偶数か奇数の合計を表示する。
	 大小の逆入力や、負の数にも対応するようにする。

	 【実行画面】
	 整数1を入力>>-4
	 整数2を入力>>-9
	 偶数(0)・奇数(1)を選択>>0
	 -9から-4までの偶数の合計は-18です。
	 */
import java.util.*;
public class Q009{
	public static void main(String[] args){
		System.out.print("整数1を入力>>");
		int num1=new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int num2=new Scanner(System.in).nextInt();
		System.out.print("偶数(0),奇数(1)を選択>>");
		int n=new Scanner(System.in).nextInt();
		int min,max;
		min=Math.min(num1,num2);
		max=Math.max(num1,num2);
		int sum=0,sum1=0;
		for(int i=0;i<=max-min;i++){
			if(num1%2==0){
				if(num1<num2){
					sum+=num1;
					num1++;
				}else{
					sum+=num1;
					num1--;
				}
			}else{
				if(num1<num2){
					sum1+=num1;
					num1++;
				}else{
					sum1+=num1;
					num1--;
				}
			}
		}
		System.out.printf("%dから%dまでの%sの合計は%dです%n",min,max,n==0?"偶数":"奇数",n==0?sum:sum1);
	}
}
