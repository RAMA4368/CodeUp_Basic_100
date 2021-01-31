package codeup100_2;

import java.util.Scanner;

public class Test61 {

	public static void main(String[] args) {
		int a,b;
		int result;
		
		System.out.println("2개의 정수가 공백을 두고 입력된다.");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		
		result=a|b;
		System.out.println(result);
		
	}
}

//
//예를 들어 3과 5가 입력되었을 때를 살펴보면
//3     : 00000000 00000000 00000000 00000011
//5     : 00000000 00000000 00000000 00000101
//3 | 5 : 00000000 00000000 00000000 00000111
//이 된다.
//
//비트단위 or 연산은 둘 중 하나라도 1인 자리를 1로 만들어주는 것과 같다.
//
//이러한 비트단위 연산은 빠른 계산이 필요한 그래픽처리에서도 효과적으로 사용된다.
//
