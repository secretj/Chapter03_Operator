package ch03_1_operator_expression;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int n1=10;
		int n2 = 10;
		boolean result1 = (n1==n2);
		boolean result2 =(n1!=n2);
		boolean result3 = (n1<=n2);
		System.out.printf("result1="+result1);
		System.out.printf("\nresult2="+result2);
		System.out.printf("\nresult3="+result3);
		
		char char1 ='A';
		char char2 = 'B';
		boolean result4 = (char1<char2);
		System.out.printf("\nresult4="+result4);

	}

}
