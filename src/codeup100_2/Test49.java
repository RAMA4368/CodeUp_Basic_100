package codeup100_2;

import java.util.Scanner;

public class Test49 {
	public static void main(String[] args) {
		int a,b;
		System.out.println("두 정수를 입력하세요");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		
		if(a>b) {
			System.out.println(1);
		}else if(a<=b) {
			System.out.println(0);
		}
		
	}
}
