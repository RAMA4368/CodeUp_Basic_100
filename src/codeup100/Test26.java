package codeup100;

import java.util.Scanner;

public class Test26 {

	
	public static void main(String[] args) {
		String time=null;
		String []result=null;
		int h,m,s;
		
		System.out.println("시:분:초 의 형식으로 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		time=scan.nextLine();
		result= time.split(":");
		h=Integer.parseInt(result[0]);
		m=Integer.parseInt(result[1]);
		s=Integer.parseInt(result[2]);
		
		System.out.println(m);
	}
}
