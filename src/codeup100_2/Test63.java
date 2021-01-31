package codeup100_2;

import java.util.Scanner;

public class Test63 {
	public static void main(String[] args) {
		
		int a,b;
		int result;
		System.out.println("2개의 정수가 공백으로 구분되어 입력된다.");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		
		
		result = (a<b)?b:a;
				
		System.out.println(result);
				
				
				
				
	}
}
