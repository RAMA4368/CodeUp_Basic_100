package codeup100;

import java.util.Scanner;

public class Test38 {
	public static void main(String[] args) {
		String num;
		int a,b;
		String[]result;
		System.out.println("정수 두개를 입력하세요");
		
		Scanner scan=new Scanner(System.in);
		num=scan.nextLine();
		result=num.split(" ");
		
		a=Integer.parseInt(result[0]);
		b=Integer.parseInt(result[1]);
		
		System.out.println(a+b);
		
		
	}
}
