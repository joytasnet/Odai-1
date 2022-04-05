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
		int time;
		int hourTime,minTime;
		System.out.print("秒を入力");
		time=new Scanner(System.in).nextInt();
		hourTime=time/3600;
		minTime=time/60;
		time-=minTime*60;
		System.out.printf("%d時間%02d分%02d秒です。",hourTime,minTime,time);
	}
}
