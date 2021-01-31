package codeup100_3;

import java.util.Scanner;

public class Test71 {

	
	public static void main(String[] args) {
		String a;
		String []num=null;
		System.out.println("정수들을 입력하세요(0이 입력되면 종료됩니다)10개 이하로");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextLine();
		num=a.split(" ");
		
		
		for(int i=0;i<num.length;i++) {
			if(!(num[i].equals("0"))) {
				System.out.println(num[i]);
			}else {
				break;
			}
		}
		
		
	}
}
