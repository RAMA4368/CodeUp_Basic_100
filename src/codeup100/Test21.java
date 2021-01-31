package codeup100;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		String InputWord=null;
		String OutputWord="";
		
		System.out.println("단어를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
//		word=scan.nextLine();
//		System.out.println("입력하신 단어는 :"+word);
		
		InputWord=scan.nextLine();
		for(int i=0;i<InputWord.length();i++) {
			OutputWord+=InputWord.charAt(i);
		}
		System.out.println("입력된 단어 : " + OutputWord);
		
	}
}
