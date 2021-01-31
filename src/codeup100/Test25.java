package codeup100;

import java.util.Scanner;

public class Test25 {

	
	public static void main(String[] args) {
		String num=null;
		char[] result=null;
		int size;
		
		System.out.println("다섯자리의 정수를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		num=scan.nextLine();
		result=num.toCharArray();
		size=result.length;
		
		
		for(int i=0;i<size;i++) {
			System.out.print("["+result[i]);
			
			for(int a=0;a<size-i-1;a++) {
				System.out.print("0");
			}
			System.out.println("]");
		}
		
		
	}
}
