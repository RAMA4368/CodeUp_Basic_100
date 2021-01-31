package codeup100;

import java.util.Scanner;

public class Test24 {

	public static void main(String[] args) {
		String word=null;
		char[] result=null;
		
		System.out.println("한 단어를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		word=scan.nextLine();
		result= word.toCharArray();
		
		for(int i=0;i<result.length;i++) {
			System.out.println("'"+result[i]+"'");
		}
		
	}
}
