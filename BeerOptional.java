package beer;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class BeerOptional {

	public static void main(String[] args) {
	
	}
	
	public static List<Beer> beermethodA(Optional<List<Beer>> beer) {
		return beer.orElseThrow(() -> new NoSuchElementException("Value is not present!"));
		
	}
	public static void beermethodB() {
		Optional<List<Beer>> beer = Optional.of(Beer.getBeers());
		System.out.println(beermethodA(beer)); 
		//unwrapped
		
		try {
		beermethodA(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
}
