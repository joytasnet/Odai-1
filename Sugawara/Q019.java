/*
【問題19】
カンマ区切りで数値を入力してもらい、その数値の中の最大値、最小値を表示する
処理を作成せよ。
【実行例】
数値をカンマ区切りで入力>>3,5,1,9,1
最大値は9,最小値は1
*/
import java.util.*;
public class Q019{
	public static void main(String[] args){
		System.out.println("数値をカンマ区切りで入力してください>>");
		String nStr =new Scanner(System.in).nextLine();

		String[] nums = nStr.split(",");
		int[] numbers = new int[nums.length];
		System.out.println(Arrays.toString(numbers));

		for(int i=0 ; i<numbers.length ; i++){
			numbers[i] = Integer.parseInt(nums[i]);
		}
		System.out.println(Arrays.toString(numbers));

		for(int i=0 ; i<numbers.length-1 ; i++){
			for(int j=i+1 ; j<numbers.length ; j++){
				if(numbers[i] > numbers[j]){
					int temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}//sort
		}
		System.out.println(Arrays.toString(numbers));
		System.out.printf("最大値は%d,最小値は%d%n",numbers[numbers.length],numbers[0]);
	}
}
