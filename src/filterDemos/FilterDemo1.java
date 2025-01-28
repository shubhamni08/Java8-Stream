package filterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(10);
//		al.add(21);
//		al.add(33);
//		al.add(45);
//		al.add(57);
		//add even no in another list
		List<Integer> arrayList = Arrays.asList(10,21,34,45,57);
		List<Integer> evenNoList = new ArrayList<>();
		//without stream
//		for(int a:arrayList) {
//			if(a%2==0) {
//				evenNoList.add(a);
//			}
//		}
		//with streams
//		evenNoList=arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());//collect the output to another list
//		System.out.println(evenNoList);
//		arrayList.stream().filter(no->no%2==0).forEach(no->System.out.print(no+" "));
		System.out.println();
		arrayList.stream().filter(no->no%2==0).forEach(System.out::println);
	}
}
