package codeup100_2;

import java.util.Scanner;

public class Test51 {
public static void main(String[] args) {
	int a,b;
	System.out.println("두 정수를 입력하세요");
	
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	
	if(b>=a) {
		System.out.println(1);
	}else {
		System.out.println(0);
	}
}
}
