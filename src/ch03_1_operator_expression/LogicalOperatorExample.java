package ch03_1_operator_expression;

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args)  {
		//����ڷκ��� ���ڸ� �ϳ� �Է¹޾Ƽ� �װ� ���
//		Scanner scn = new Scanner(System.in);
//		
//		
//		while(true) {
//			System.out.println("[���ڸ� ���ڷ� �ٲ㺸��]");
//		System.out.printf("����:");
//		String m=scn.nextLine();
//		
//		System.out.println("����:"+Integer.parseInt(m));
//		if(m.equals('z'))
//			break;
//		
//		}
//				System.out.println("��");
		
		int charC= 'A';
		
		if((charC>=65)&(charC<=90)){
			System.out.println("�빮�ڱ���");
		}
		
		
		if((charC>=97)&&(charC<=122)){
			System.out.println("�ҹ��ڱ���");
		}
		
		
		if((charC<48) && !(charC>57)){
			System.out.println("0~9 ����");
		}
		
		int value =6;
		
		if((value%2==0) |(value%3==0)){
			System.out.println("2 �Ǵ� 3�� �������");
		}
		
		if((value%2==0) ||(value%3==0)){
			System.out.println("2 �Ǵ� 3�� �������");
		}
		
		
		

	}

}
