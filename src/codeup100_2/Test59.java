package codeup100_2;

import java.util.Scanner;

public class Test59 {
public static void main(String[] args) {
	int a;
	int result;
	
	System.out.println("정수 1개를 입력하세요");
	Scanner scan=new Scanner(System.in);
	
	a=scan.nextInt();
	result=~a;
	System.out.printf("%d",result);
}
}
