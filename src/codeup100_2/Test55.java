package codeup100_2;

import java.util.Scanner;

public class Test55 {
public static void main(String[] args) {
	int a,b;
	int result;
	
	System.out.println("두개의 정수를 입력하세요");
	Scanner scan=new Scanner(System.in);
	
	a=scan.nextInt();
	b=scan.nextInt();
	
	result=(a==1)||(b==1)?1:0;
	
	System.out.println(result);
	
}
}
