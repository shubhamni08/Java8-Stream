package LambdaExpression;

@FunctionalInterface
interface Sum{
	int sumCalculate(int a, int b);
}

//Write a Java program to implement a lambda expression to find the sum of two integers.
public class SumOf2Integer {

	public static void main(String[] args) {
		
		Sum s = (a,b)->{return a+b;};
		int result = s.sumCalculate(10,5);
		System.out.println("Sum of 10,5 is : "+result);
	}

}
