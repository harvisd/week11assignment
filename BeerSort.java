package beer;

import java.util.List;

public class BeerSort {
	static Beer beer = new Beer();
	
	
	public static List<Beer> sorted() {
		List<Beer> beerType = Beer.getBeers();
		beerType.sort((b1, b2) -> Beer.compare(b1, b1));
		return beerType;
	}
	
	public static List<Beer> MethodRefSort() {
		List<Beer> beerType = Beer.getBeers();
		beerType.sort(Beer::compare);
		return beerType;
	}
	
	public static void main(String[] args) {
		List<Beer> sortedList = BeerSort.sorted();
		System.out.println(sortedList);
		
		List<Beer> mSortedList = BeerSort.MethodRefSort();
		System.out.println(mSortedList);
		
		
	}
	
}
