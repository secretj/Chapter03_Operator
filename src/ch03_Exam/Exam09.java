package ch03_Exam;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("ù��°��:");
		String num1=scn.nextLine();
		System.out.printf("�ι�°��:");
		String num2=scn.nextLine();
		System.out.println("------------------");
		
		if(!num2.equals(0)) {
			System.out.printf("���:"+(Double.parseDouble(num1)/Double.parseDouble(num2)));
		}else{System.out.printf("(or ���: ���Ѵ�)");
		
		}

	}

}
