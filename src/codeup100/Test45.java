package codeup100;

import java.util.Scanner;

public class Test45 {
	public static void main(String[] args) {
		int a,b;
		int sum;
		int sub;
		int result1,result2,result3,result4;
		
		
		System.out.println("정수 2개를 입력하세요");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		
		sum=a+b;
		sub=a-b;
		result1=a*b;
		result2=a/b;
		result3=a%b;
		result4=a/b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.printf("%.2f",(float)result4);
		
		
		
		
	}
}
