package LambdaExpression;

import java.util.ArrayList;
import java.util.stream.Collectors;

@FunctionalInterface
interface Converter<T,R>{
	
	R convert(T input);			//single abstract method T-input, R-Return type
}

public class GenericLambdaExample {

	public static void main(String[] args) {
		
		Converter<String, String> c = (str)->str.toUpperCase();
		System.out.println(c.convert("shubham nikam"));

		
		Converter<String, Integer> c1 = (str)->Integer.parseInt(str);
		System.out.println(c1.convert("123"));
		
		String str = "Java-Selenium";
		ArrayList<Character> al = new ArrayList<>(
				str.chars()
				.mapToObj(e->(char)e)
				.collect(
						Collectors.toList()
						)
				);
		System.out.println(al);
	}

}
