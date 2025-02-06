package streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInterface {

	public static void main(String[] args) {
		
		//eg. pass string and return size of string
		Function<String, Integer> f = (name)->name.length();
		System.out.println(f.apply("Shubham"));

		//eg. find sq rooot of a number
		Function<Integer, Double> obj = no -> Math.sqrt(no);
		System.out.println(obj.apply(20));
		
		//.andThen(). and .compose().
		Function<Integer, Integer> f1 = n->n*2;
		Function<Integer, Integer> f2 = n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2));	//2*2=4  then 4*4*4=64
		System.out.println(f1.compose(f2).apply(2));	//2*2*2=8 compose and then 8*2=16

	}

}
