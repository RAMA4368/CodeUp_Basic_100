package codeup100_3;

import java.util.Scanner;

public class Test89 {

	public static void main(String[] args) {
		int a,d;
		int n;
		int result=0;
		int sum=0;
		
		System.out.println("시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 100)");
		Scanner scan=new Scanner(System.in);
		
		a=scan.nextInt();
		d=scan.nextInt();
		n=scan.nextInt();
		
//		for(int i=a;i<n;) {
//			if(result==n) {
//				System.out.printf("%d",i);
//				break;
//			}else {
//				i+=d;
//				result++;
//				
//			}
//		}
		
		System.out.printf("%d",a+d*(n-1));
	}
}
//모르겠당@@@@