package codeup100_3;

import java.util.Scanner;

public class Test87 {

	public static void main(String[] args) {
		int n;
		int sum=0;
		System.out.println("언제까지 합을 계산할 지, 정수 1개를 입력받는다.단, 입력되는 자연수는 100,000,000이하이다.");
		
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		for(int i=1;i<n;i++) {
			if(sum<n) {
				sum+=i;
			}else {
				System.out.println(sum);
				break;
			}
		}
	}
}
