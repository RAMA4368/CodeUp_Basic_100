package codeup100;

import java.util.Scanner;

public class Test27 {

	
	public static void main(String[] args) {
		String data=null;
		String[] result;
		int y,m,d;
		
		System.out.println("\"년,월,일\" 을 yyyy.mm.dd.의 형식으로 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		data=scan.nextLine();
		result=data.split("\\.");
		y=Integer.parseInt(result[0]);
		m=Integer.parseInt(result[1]);
		d=Integer.parseInt(result[2]);
		
		System.out.printf("%02d-%02d-%04d",d,m,y);
		
	}
}
