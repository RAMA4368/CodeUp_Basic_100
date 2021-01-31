package codeup100;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		
		int y,m,d;
		String date=null;
		String []data =null;
		
		System.out.println("년,월,일 을 , 과 함께 입력하세요");
		Scanner scan =new Scanner(System.in);
		
		date=scan.nextLine();
		data=date.split(",");
		
		y=Integer.parseInt(data[0]);
		m=Integer.parseInt(data[1]);
		d=Integer.parseInt(data[2]);
		
		
		System.out.printf("%d년,%02d월,%02d일 ",y,m,d);
	}
}
