package codeup100;

import java.util.Scanner;

public class Test28 {

	public static void main(String[] args) {
		int num;
		String data;
		Scanner scan=new Scanner(System.in);

		System.out.println("정수 한개를 입력하세요, (단, 입력되는 정수의 범위는 0 ~ 4,294,967,295 이다.)");
		
		num=scan.nextInt();
		data=Integer.toUnsignedString(num);
		
		System.out.println(data);
		
}
}
