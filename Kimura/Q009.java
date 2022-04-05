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
		int inp_1 = new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int inp_2 = new Scanner(System.in).nextInt();
		System.out.print("偶数(0)・奇数(1)を選択>>");
		int inp_3 = new Scanner(System.in).nextInt();
		if(inp_1>inp_2){
			int temp = inp_2;
			inp_2 = inp_1;
			inp_1 = temp;
		}
		int sum =0;
		//偶数or奇数の合計計算
		if(inp_3 >0){
			for(int i=inp_1;i<=inp_2;i++){
				if(i %2 !=0){
					sum += i;
				}
			}
		}else{
			for(int i=inp_1;i<=inp_2;i++){
				if(i %2 ==0){
					sum += i;
				}
			}
		}
		System.out.printf("%dから%dまでの%sの合計は%dです。",inp_1,inp_2,inp_3>0?"奇数":"偶数",sum);
	}
}
