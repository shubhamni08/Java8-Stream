package LambdaExpression;

@FunctionalInterface
interface Square {
	int calculate(int a);	//single abstract method
}

public class SquareExample {

	public static void main(String[] args) {
		Square s = a->{return a*a;};	//if you are return something then use {} 
		System.out.println("Square of 5: " + s.calculate(5));
	}
	

}
