package codeup100;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		char x,y;
		String character;
		char temp;
		String []ascii;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 2개를 입력하세요 ,로 구분해 입력하세요");
		character =scan.nextLine();
		
		ascii=character.split(",",2);
		
		x=ascii[0].charAt(0);
		y=ascii[1].charAt(0);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("x는"+x+"y는"+y);
		
		
		
	}
		
}
