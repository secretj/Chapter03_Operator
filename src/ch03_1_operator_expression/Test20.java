package ch03_1_operator_expression;

public class Test20 {

	public static void main(String[] args) {
		int num1 = 0, num2 =0;
		boolean result;
		
		result =((num1+=10)<0 &&(num2+=10)>0);
//num1�� false�⶧���� num2�� ��������ʾƼ� num1=10 num2=0�� �ȴ�
		System.out.printf("num1:%d, num2=%d\n",num1, num2);
		result=((num1+=10)>0 ||(num2+=10)<0);
		//num1�� True�� ������ num2 ����� ���ϰ� �Ѿ num1=20, num2 =0
		System.out.printf("num1:%d, num2=%d\n",num1, num2);
		
	}

}
