package codeup100_2;

import java.util.Scanner;

public class Test68 {
	public static void main(String[] args) {
		int score;
		
		System.out.println("점수를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		score=scan.nextInt();
		
		if(score>=90&&score<=100) {
			System.out.println("A");
		}else if(score>=70&&score<=89) {
			System.out.println("B");
		}else if(score>=40&&score<=69) {
			System.out.println("C");
		}else if(score>=0&&score<=39) {
			System.out.println("D");
		}
	}
}
