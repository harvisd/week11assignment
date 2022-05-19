package beer;

import java.util.ArrayList;
import java.util.List;

public class Beer {

	public static Object beerTypes;
	private String beerName;
	
	public Beer() {}
	public Beer(String name) {
		this.beerName = name;
	}
	
	@Override
	public String toString() {
		return (this.getName() + " Beer");
	}
	//getters and setters
	public String getName() {
		return beerName;
	}
	public void setName(String name) {
		this.beerName = name;
	}
	
	//compare method
	public static int compare(Beer b1, Beer b2) {
		return b1.beerName.compareTo(b2.beerName);
	}
	
	public static List<Beer> beers = new ArrayList<Beer>(List.of
			(new Beer("Pilsner"), new Beer("Lager"), new Beer("Shandy"), 
			new Beer("Stout"), new Beer("Ale"), new Beer("Porter")));
	
//	public static List<String> beers = new ArrayList<>(Arrays.asList
//	("Pilsner", "Lager", "Shandy", "Stout", "Ale", "Porter"));
	
	public static List<Beer> getBeers() {
		return beers; //returns list of beer
	}

	

	
}
