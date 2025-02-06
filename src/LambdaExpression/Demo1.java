package LambdaExpression;

@FunctionalInterface
interface Cab {
	
	public void bookCab();	// Single abstract method

}

public class Demo1 implements Cab{

	//without lambda expression
	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		obj.bookCab();
		
	}

	@Override
	public void bookCab() {
		System.out.println("Cab is booked");
		
	}

}
