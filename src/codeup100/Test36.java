package codeup100;

import java.util.Scanner;

public class Test36 {
	public static void main(String[] args) {
		char c;
		int n;
		
		System.out.println("영문자 1개를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		c=scan.next().charAt(0);
		n=(int)c;
		System.out.println(n);
	}
}
