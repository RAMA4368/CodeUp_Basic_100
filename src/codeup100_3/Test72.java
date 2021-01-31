package codeup100_3;

import java.util.Scanner;

public class Test72 {
public static void main(String[] args) {
	int n;
	String str;
	String []num=null;
	
	System.out.println("몇개의 정수를 입력하실건가요?");
	Scanner scan=new Scanner(System.in);
	
	n=scan.nextInt();
	
	System.out.println("정수를 입력하세요");
	Scanner scan1=new Scanner(System.in);
	
	str=scan1.nextLine();
	num=str.split(" ");
	
	for(int i=0;i<num.length;i++) {
	System.out.println(num[i]);
	}
}
}
