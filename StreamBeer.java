package beer;

import java.util.List;
import java.util.stream.Collectors;

public class StreamBeer { 

	public static void main(String[] args) {
	
		List<Beer> beerType = Beer.getBeers();
		String beerStream = beerType.stream()
		.map(Beer::toString)
		.sorted()
		.collect(Collectors.joining(" , "));
		System.out.println(beerStream);
	}

}
