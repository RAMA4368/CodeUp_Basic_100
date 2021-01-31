package codeup100;

import java.util.Scanner;

public class Test18 {

	
	public static void main(String[] args) {
		
		int h,m;
		String str=null;
		String[] temp=null;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\"시:분\" 형식으로 입력하세요");
		
		str=scan.nextLine();
		temp=str.split(":");
		
		h=Integer.parseInt(temp[0]);
		m=Integer.parseInt(temp[1]);
		
		System.out.printf("입력받은 시간은: %d:%d",h,m);
		
	}
}
