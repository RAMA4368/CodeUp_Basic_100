package codeup100_2;

import java.util.Scanner;

public class Test64 {
public static void main(String[] args) {
		
		int a,b,c;
		int result;
		System.out.println("3개의 정수가 공백으로 구분되어 입력된다.");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		result = (a<b?a:b)<c?(a<b?a:b):c;
				
		System.out.println(result);
				
				
				
				
	}
}
