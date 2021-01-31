package codeup100_3;

import java.util.Scanner;

public class Test81 {

	
	public static void main(String[] args) {
		
		int n,m;
		System.out.println("주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.단, n, m은 10이하의 자연수");
		
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		
		// n2 m3
		
		for( int i=1;i<=n;i++) {
			for(int a=1;a<=m;a++) {
				System.out.printf(i+" "+a+"\n");
			}
		}
		
	}
}


