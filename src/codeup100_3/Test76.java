package codeup100_3;

import java.util.Scanner;

public class Test76 {
	public static void main(String[] args) {
		char c;
		char result='a';
		System.out.println("영문자 1개를 입력하세요");
		
		Scanner scan=new Scanner(System.in);
		c=scan.next().charAt(0);
		
		while(c>=result) {
			System.out.println(result+" ");
			result++;
		}
		
	}
}
