package codeup100_2;

import java.util.Scanner;

public class Test60 {
public static void main(String[] args) {
	int a,b;
	int result;
	
	System.out.println("2개의 정수를 입력하세요(공백을 두세요)");
	
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	
	result=a&b;
	
	System.out.println(result);
}
}
