package codeup100;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		
		String num;
		int f,b;
		String []number;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(-포함)");
		
		num=scan.nextLine();
		number=num.split("-");
		
		f=Integer.parseInt(number[0]);
		b=Integer.parseInt(number[1]);
		
		System.out.printf("%d%d",f,b);
		
		
		
	}


}
