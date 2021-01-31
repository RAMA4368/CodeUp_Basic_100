package codeup100;

import java.util.Scanner;

public class Test39 {

	public static void main(String[] args) {
		String num;
		String []result;
		long a,b;
		
		System.out.println("정수 2개를 입력하세요(단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.)");
		
		Scanner scan=new Scanner(System.in);
		num=scan.nextLine();
		result=num.split(" ");
		a=Long.parseLong(result[0]);
		b=Long.parseLong(result[1]);
		
		System.out.println(a+b);
		
	}
}
