package codeup100_3;

import java.util.Scanner;

public class Test75 {
public static void main(String[] args) {
	System.out.println("정수1개를 입력하세요");
	int n;
	
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	
	while(n!=0) {
		System.out.println(n-1);
		n--;
	}
}
}
