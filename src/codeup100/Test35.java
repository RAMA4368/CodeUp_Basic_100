package codeup100;

import java.util.Scanner;

//16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
//
//참고
//%x(영문자 소문자) 나 %X(영문자 대문자)로 입력 받으면
//16진수로 인식시켜 저장시킬 수 있다. %o로 출력하면 8진수로 출력된다.
//
//C언어에서 소스 코드 작성시 0으로 시작하는 수는 8진수로 인식된다.
//또한 소스코드 내에서 //로 시작하면 1줄 설명을 넣을 수 있다.
//여러 줄을 설명(주석) 을 넣을 경우 /* 와 */ 사이에 작성하면 된다.

public class Test35 {
	
	public static void main(String[] args) {
		int n;
		String str=null;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("16진수 1개를 입력하세요(단, 16진수는 영문 소문자로 입력된다.)");
		
		str=scan.nextLine();
		
		n=Integer.parseInt(str,16);
		
		System.out.printf("%o",n);
	}
}