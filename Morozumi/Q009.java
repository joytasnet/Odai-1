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
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int num2 = new Scanner(System.in).nextInt();

		String[] str = {"偶数", "奇数"};
		System.out.print("偶数(0)・奇数(1)を選択>>");
		int choice = new Scanner(System.in).nextInt();

		int[] nums = new int[Math.max(num1,num2)-Math.min(num1,num2) + 1];
		int[] sums = new int[2];

		for(int i=0; i<nums.length; i++){
			nums[i] = Math.min(num1, num2) + i;
			if(choice == 0){
				if(nums[i]%2 == 0){
					sums[choice] += nums[i];
				}
			}else{
				if(nums[i]%2 != 0){
					sums[choice] += nums[i];
				}
			}
		}
		System.out.printf("%dから%dまでの%sの合計は%dです。%n",Math.min(num1,num2),Math.max(num1,num2),str[choice],sums[choice]);


	}
}
