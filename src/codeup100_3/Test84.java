package codeup100_3;

import java.util.Scanner;

public class Test84 {

	public static void main(String[] args) {
		int r,g,b;
		int result=0;
		
		System.out.println("빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.");
		Scanner scan=new Scanner(System.in);
		
		r=scan.nextInt();
		g=scan.nextInt();
		b=scan.nextInt();
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<g;j++) {
				for(int a=0;a<b;a++) {
					System.out.printf("%d, %d, %d\n",i,j,a);
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
