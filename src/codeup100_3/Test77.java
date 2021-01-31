package codeup100_3;

import java.util.Scanner;

public class Test77 {
	public static void main(String[] args) {
		int a;
		int result=0;
		System.out.println("정수1개를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		a=scan.nextInt();
		while(a>=result) {
		System.out.println(result);
		result++;
		}
	}
}
