package codeup100_3;

import java.util.Scanner;

public class Test85 {

	public static void main(String[] args) {
		int h,b,c,s;
		
		System.out.println("h, b, c, s 가 공백을 두고 입력된다.h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.");
		Scanner scan=new Scanner(System.in);
		
		h=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		s=scan.nextInt();
		
		System.out.printf("%.2f MB",h*b*c*s);
		
		
		
		//모르겠음!!!! 에러
	}
}
