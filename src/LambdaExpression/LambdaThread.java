package LambdaExpression;

public class LambdaThread {

	public static void main(String[] args) {
		Thread t = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Thread Running - "+i);
			}
		});
		
		t.start();

	}

}
