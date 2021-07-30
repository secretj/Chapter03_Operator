package ch03_1_operator_expression;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		while(true) {
		System.out.println("[문자를 숫자로 바꿔보자]");
		System.out.printf("문자:");
		String m=scn.nextLine();
		
		//System.out.println("숫자:"+Integer.parsInt(m));
		if(m.equals('z'))
			break;
		
		}
				System.out.println("끝");
				scn.close();
	}

}
