package LambdaExpression;

public class Demo2 {

	//with lambda expression
	public static void main(String[] args) {
		//lambda expression work with functional interface(single abstract method, Can have multiple default and static methods.)
		Cab c =	()->System.out.println("Cab is booked");
		c.bookCab();
	}

}
