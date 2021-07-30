package ch03_1_operator_expression;

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args)  {
		//사용자로부터 문자를 하나 입력받아서 그걸 출력
//		Scanner scn = new Scanner(System.in);
//		
//		
//		while(true) {
//			System.out.println("[문자를 숫자로 바꿔보자]");
//		System.out.printf("문자:");
//		String m=scn.nextLine();
//		
//		System.out.println("숫자:"+Integer.parseInt(m));
//		if(m.equals('z'))
//			break;
//		
//		}
//				System.out.println("끝");
		
		int charC= 'A';
		
		if((charC>=65)&(charC<=90)){
			System.out.println("대문자군요");
		}
		
		
		if((charC>=97)&&(charC<=122)){
			System.out.println("소문자군요");
		}
		
		
		if((charC<48) && !(charC>57)){
			System.out.println("0~9 군요");
		}
		
		int value =6;
		
		if((value%2==0) |(value%3==0)){
			System.out.println("2 또는 3의 배수군요");
		}
		
		if((value%2==0) ||(value%3==0)){
			System.out.println("2 또는 3의 배수군요");
		}
		
		
		

	}

}
