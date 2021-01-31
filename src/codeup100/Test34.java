package codeup100;

import java.util.Scanner;

public class Test34 {

	
	public static void main(String[] args) {
		int n;
		String str;
		
		System.out.println("8진수 정수 한개를 입력하세요");
		
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		n=Integer.valueOf(str,8);
		
		System.out.printf("%d",n);
	}
}
