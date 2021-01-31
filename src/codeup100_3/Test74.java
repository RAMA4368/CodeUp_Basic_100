package codeup100_3;

import java.util.Scanner;

public class Test74 {
public static void main(String[] args) {
	
	
	int n;
	Scanner scan=new Scanner(System.in);
	System.out.println("정수 1개를 입력하세요");
	n=scan.nextInt();
	
	while(n!=0) {
		System.out.println(n);
		n--;
	}
}
}
