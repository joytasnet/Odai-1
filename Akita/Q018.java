/*
【問題18】
スカイツリーの高さは634m(ムサシ)です。
これを出題して、正解ならあたり、そうでなければはずれと出力する処理を作成せよ
【実行例1】
スカイツリーの高さは(m)?>>634
あたり
【実行例2】
スカイツリーの高さは(m)?>>333
はずれ、正解は634m
*/
import java.util.*;
public class Q018{
	public static void main(String[] args){
		System.out.print("スカイツリーの高さは(m)?>>");
		int n = new Scanner(System.in).nextInt();
		System.out.println(n==634?"あたり":"はずれ、正解は634m");

	}
}
