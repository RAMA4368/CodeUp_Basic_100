package codeup100_2;

import java.util.Scanner;

public class Test58 {
public static void main(String[] args) {
	int a,b;
	int result;
	
	System.out.println("1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.");
	
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	
	result=(a==0)&&(b==0)?1:0;
	
	System.out.println(result);
}
}
