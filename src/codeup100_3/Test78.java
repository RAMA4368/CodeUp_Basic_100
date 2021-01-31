package codeup100_3;

import java.util.Scanner;

public class Test78 {
public static void main(String[] args) {
	int a;

	int sum=0;
	
	System.out.println("정수 1개를 입력하세요");
	
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();

	for(int i=0;i<a;i++) {
		if(i%2==0) {
			sum+=i;
		}
	}

	System.out.println(sum);
	
	
	
}
}
