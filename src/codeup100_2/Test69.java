package codeup100_2;

import java.util.Scanner;

public class Test69 {
	public static void main(String[] args) {
		char a;
		String result=null;
		
		System.out.println("A,B,C,D 중 한문자를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		a=scan.nextLine().charAt(0);
		
		switch(a) {
		case 'A': result="best!";
		break;
		case 'B':result="good!!";
		break;
		case 'C':result="run!";
		break;
		case 'D':result="slowly~";
		default : result = "what?";
			
		}
		System.out.println(result);
	}
}
