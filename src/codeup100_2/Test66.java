package codeup100_2;

import java.util.Scanner;

public class Test66 {
public static void main(String[] args) {
	int a,b,c;
	int []result = new int[3];
	
	System.out.println("정수 3개를 입력하세요");
	Scanner scan=new Scanner(System.in);
	
	a=scan.nextInt();
	b=scan.nextInt();
	c=scan.nextInt();
	
	result[0]=a;
	result[1]=b;
	result[2]=c;
	
	for(int i=0;i<result.length;i++) {
	if(result[i]%2==0) {
		System.out.println("even");
	}else {
		System.out.println("odd");
	}
	}
}
}
