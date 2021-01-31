package codeup100_2;

import java.util.Scanner;

public class Test70 {
public static void main(String[] args) {
	int a;
	String result=null;
	System.out.println("월을 입력하세요");
	Scanner scan=new Scanner(System.in);
	
	a=scan.nextInt();
	
	switch(a) {
			case 12 :
			case 1 :
			case 2 : result="winter"; break;
			case 3 :
			case 4 :
			case 5 : result="spring"; break;
			case 6 :
			case 7 :
			case 8 : result="summer"; break;
			case 9 :
			case 10 :
			case 11 : result="fall"; break;
		
	}
	System.out.println(result);
}
}
