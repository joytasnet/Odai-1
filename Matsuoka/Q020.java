/*
【問題20】
名前をカンマ区切りで入力。
それを名前の文字数の多い順に表示する。
【実行例】
名前をカンマ区切りで入力>>John,Paul,Ringo,George
George
Ringo
John
Paul
*/
import java.util.*;
public class Q020{
	public static void main(String[] args){
		String name;
		System.out.print("名前をカンマ区切りで入力>>");
		name=new Scanner(System.in).nextLine();
		String[] names=name.split(",");
		int[] sizes=new int[names.length];
		for(int i=0;i<names.length;i++){
			sizes[i]=names[i].length();
		}
		for(int i=0;i<names.length-1;i++){
			for(int j=i+1;j<names.length;j++){
				if(sizes[i]<sizes[j]){
					int tmp;
					tmp=sizes[i];
					sizes[i]=sizes[j];
					sizes[j]=tmp;
					String nametmp;
					nametmp=names[i];
					names[i]=names[j];
					names[j]=nametmp;
				}
			}
		}
		for(int i=0;i<names.length;i++){
			System.out.printf("%s%n",names[i]);
		}
	}
}
