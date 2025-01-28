package filterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Shubham","Aish","Shrestha","Ben","Park",null ,null);
		List<String> output = new ArrayList<>();
		
//		l.stream().filter(s->s!=null && s.length()>4).sorted().forEach(n->System.out.println(n+" "));
		
		output = l.stream().filter(s->s!=null && s.length()>4).sorted().collect(Collectors.toList());
		
		System.out.println(output);
	}
}
