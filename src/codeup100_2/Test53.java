package codeup100_2;

import java.util.Scanner;

public class Test53 {

	public static void main(String[] args) {
		int a;
		int result;
		System.out.println("정수 1개가 입력된다.(단, 0 또는 1 만 입력된다.)");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		result =!(a==0)?0:1;
		
		System.out.println(result);
	}
}
