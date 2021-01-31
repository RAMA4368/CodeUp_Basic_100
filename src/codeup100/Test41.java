package codeup100;

import java.util.Scanner;

public class Test41 {

	
	public static void main(String[] args) {
		int n; 
		System.out.println("영문자 1개를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		n=(int)(scan.next().charAt(0))+1;
		
		System.out.printf("%c",n);
	
	}
}
