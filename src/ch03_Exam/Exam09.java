package ch03_Exam;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("첫번째수:");
		String num1=scn.nextLine();
		System.out.printf("두번째수:");
		String num2=scn.nextLine();
		System.out.println("------------------");
		
		if(!num2.equals(0)) {
			System.out.printf("결과:"+(Double.parseDouble(num1)/Double.parseDouble(num2)));
		}else{System.out.printf("(or 결과: 무한대)");
		
		}

	}

}
