package codeup100_3;

import java.util.Scanner;

public class Test82 {
	
	
	public static void main(String[] args) {
		String a;
		System.out.println("16진수로 한 자리 수가 입력된다.단, A ~ F 까지만 입력된다.");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextLine();
		
		//입력한 문자를 16진수 정수로 바꾼다. 
		int num=Integer.parseInt(a,16);
		
		for(int i=1;i<16; i++) {
			System.out.printf("%X * %X = %X",num,i,num*i);
			System.out.print("\n");
		}
		
	}
}
