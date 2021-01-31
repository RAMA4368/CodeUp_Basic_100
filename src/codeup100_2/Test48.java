package codeup100_2;

import java.util.Scanner;

public class Test48 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("정수 2개를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.printf("%d",a*(a<<b));
		
//		참고
//		예를 들어 1 3 이 입력되면 1을 23(8)배 하여 출력한다.
//
//		예시
//		int a=1, b=10;
//		printf("%d", a << b); //210 = 1024 가 출력된다.
	}
}
