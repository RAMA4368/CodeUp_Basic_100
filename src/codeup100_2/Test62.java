package codeup100_2;

import java.util.Scanner;

public class Test62 {
public static void main(String[] args) {
	int a,b,result;
	System.out.println("2개의 정수가 공백을 두고 입력된다.");
	
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	
	result=a^b;
	System.out.println(result);
}
}
//예를 들어 3과 5가 입력되었을 때를 살펴보면
//3       : 00000000 00000000 00000000 00000011
//5       : 00000000 00000000 00000000 00000101
//3 ^ 5 : 00000000 00000000 00000000 00000110
//이 된다.
//이러한 비트단위 연산은 빠른 계산이 필요한 그래픽처리에서도 효과적으로 사용된다.
//
//구체적으로 설명하자면,
//두 장의 이미지가 겹쳐졌을 때 색이 서로 다른 부분만 처리할 수 있다.
//배경이 되는 그림과 배경 위에서 움직이는 그림이 있을 때,
//두 그림에서 차이만 골라내 배경 위에서 움직이는 그림의 색으로 바꿔주면
//전체 그림을 구성하는 모든 점들의 색을 다시 계산해 입히지 않고
//보다 효과적으로 그림을 처리할 수 있게 되는 것이다.
//비행기 슈팅게임 등을 상상해보면 된다.
