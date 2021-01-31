package codeup100_2;

import java.util.Scanner;

public class Test65 {
public static void main(String[] args) {
	int a,b,c;
	int result;
	
	System.out.println("3개의 정수를 입력하세요");
	Scanner scan=new Scanner(System.in);
	
	a=scan.nextInt();
	b=scan.nextInt();
	c=scan.nextInt();
	
	if(a%2==0) {
		System.out.println(a);
	}
	if(b%2==0) {
		System.out.println(b);
	}
	if(c%2==0) {
		System.out.println(c);
	}
}
}
