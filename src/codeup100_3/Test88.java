package codeup100_3;

import java.util.Scanner;

public class Test88 {
public static void main(String[] args) {
	int a;
	int i;
	System.out.println("정수를 1개를 입력하세요");
	Scanner scan=new Scanner(System.in);
	
	a=scan.nextInt();
	
	for(i=0;i<=a;i++) {
		if(i%3==0) {
			continue;	
		}else {
			System.out.println(i);
		}
		
	}
}
}
//참고
//반복문 안에서 continue;가 실행되면 그 아래의 내용을 건너뛰고, 다음 반복을 수행한다.
//즉, 다음 반복으로 넘어가는 것이다.