package codeup100;

import java.util.Scanner;

public class Test43 {

	public static void main(String[] args) {
		int a,b;
		
		System.out.println("정수 두개를 입력하세요 a/b");
		
		Scanner scan=new Scanner(System.in);
		
		 a =scan.nextInt();
		 b=scan.nextInt();
		
		 System.out.println(a%b);
	}
}
