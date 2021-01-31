package codeup100_3;

import java.util.Scanner;

public class Test80 {

	
	public static void main(String[] args) {
		int a;
		int sum=0;
		int i;
		
		
		System.out.println("정수 1개를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		a=scan.nextInt();
		
		for(i=1;sum<a;++i) {
			sum+=i;
		}			
			System.out.println(i-1);
		
	}
}
