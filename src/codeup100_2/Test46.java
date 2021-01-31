package codeup100_2;

import java.util.Scanner;

public class Test46 {
	public static void main(String[] args) {
		int a,b,c;
		int sum;
		int avg;
		
		System.out.println("정수 3개를 입력하세요");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		sum=a+b+c;
		avg=sum/3;
		
		System.out.println(sum);
		System.out.printf("%.1f",(float)avg);
		
		
	}

}
