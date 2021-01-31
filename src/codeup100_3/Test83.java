package codeup100_3;

import java.util.Scanner;

public class Test83 {
	public static void main(String[] args) {
		int a;
		System.out.println("10 보다 작은 정수 1개가 입력된다 (1 ~ 9)");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		
		for(int i=1;i<=a;i++) {
		if(i%3==0) {
			System.out.println("짝");
		}else {
			System.out.println(i+"\n");
		}
		}
	}
}
