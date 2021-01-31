package codeup100_2;

import java.util.Scanner;

public class Test67 {
	public static void main(String[] args) {
		int a;
		
		System.out.println("정수 1개를 입력하세요");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		
		if(a<0) {
			System.out.println("음");
		}else {
			System.out.println("양");
		}
		
		if(a%2==0) {
			System.out.println("짝");
		}else {
			System.out.println("홀");
		}
	
	}
}
