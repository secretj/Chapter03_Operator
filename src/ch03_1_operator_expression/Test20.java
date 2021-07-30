package ch03_1_operator_expression;

public class Test20 {

	public static void main(String[] args) {
		int num1 = 0, num2 =0;
		boolean result;
		
		result =((num1+=10)<0 &&(num2+=10)>0);
//num1이 false기때문에 num2는 계산하지않아서 num1=10 num2=0이 된다
		System.out.printf("num1:%d, num2=%d\n",num1, num2);
		result=((num1+=10)>0 ||(num2+=10)<0);
		//num1이 True기 때문에 num2 계산은 안하고 넘어감 num1=20, num2 =0
		System.out.printf("num1:%d, num2=%d\n",num1, num2);
		
	}

}
