package mapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("Bike","Car","Tempo","SuperBike","SuperCar");
		List<String> output = new ArrayList<>();
		//convert lower case letter to upper case 
		//without streams
//		for(String s:vehicles) {
//			output.add(s.toUpperCase());
//		}
//		System.out.println(output);
		
		//with streams
//		output = vehicles.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		vehicles.stream().map(i->i.toUpperCase()).forEach(i->System.out.print(i+" "));
//		System.out.println(output);
	}

}
