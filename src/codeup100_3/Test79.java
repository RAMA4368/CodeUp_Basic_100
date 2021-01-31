package codeup100_3;

import java.util.Scanner;

public class Test79 {

	
	public static void main(String[] args) {
		String a; 
		String []result;
		
		System.out.println("문자를 입력하세요");
		Scanner scan=new Scanner(System.in);
		
		a=scan.nextLine();
		result=a.split(" ");
		
		
		
		for(int i=0;i<result.length;i++) {
			if(result[i].equals("q")) {
				System.out.println(result[i]);
				break;
			}else {
				System.out.println(result[i]);
			}
			
		}
		
			
		}
	}

