package codeup100;

import java.util.Scanner;

public class Test23 {

	
	public static void main(String[] args) {
		System.out.println("실수 1개를 입력하세요");
		String num=null;
		String []data=null;
		
		Scanner scan=new Scanner(System.in);
		
		num = scan.nextLine();
		
		data=num.split("\\.");
		
		System.out.println(data[0]+"\n"+data[1]);
		
		
	}
}
