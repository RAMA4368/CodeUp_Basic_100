package codeup100;

import java.util.Scanner;

public class Test40 {

	public static void main(String[] args) {
		int n;
		
		System.out.println("부호와 함께 정수를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		n=scan.nextInt();
		
		System.out.println("바뀐 부호 출력 : " + -n);
	}
}
