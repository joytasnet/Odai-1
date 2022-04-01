/*
【問題004】
下の図のように、秒（正の整数)を入力すると、何時間・何分・何秒かを表示する。
分・秒の値は、10以下であっても、0を補って2桁で表示する。

【実行画面】
秒を入力>>3485【enterキー】
0時間58分05秒です。
*/
import java.util.*;
public class Q004{
	public static void main(String[] args){
		System.out.print("秒を入力>>");
		int user = new Scanner(System.in).nextInt();

		int second =0;
		int hour =0;
		int minuit =0;

		//for(int i=0; i<minuit ; i++){//hour
			for(int j=0; j<user ; j++){//minuit 
				second ++;
				if(second>=60){
					minuit ++;
					second -= 60;
				}
				if(minuit>=60){
					hour++;
					minuit -= 60;
				}
			}
	//}
		System.out.printf("%d時間%d分%d秒です。%n",hour,minuit,second);
	}
}
