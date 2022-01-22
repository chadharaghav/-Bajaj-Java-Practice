package day_four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Instrument {
	private String name;
	private String brand;
	private int price;
	
	public Instrument(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "Instrument [name = " + name + ", brand = " + brand + ", price = " + price + "]";
	}
}

class SortByPrice implements Comparator<Instrument> {	 
    public int compare(Instrument a, Instrument b)	{
        return a.getPrice() - b.getPrice();
    }
}

public class CollectionPractice {

	public static void main(String[] args) {
		// making the list and adding the data
		List<Instrument> instruments = new ArrayList<Instrument>();
		instruments.add(new Instrument("guitar", "fender", 50000));
		instruments.add(new Instrument("piano", "yamaha", 25000));
		instruments.add(new Instrument("guitar", "yamaha", 30000));
		instruments.add(new Instrument("drums", "ludwig", 20000));
		instruments.add(new Instrument("bongo", "menyl", 5000));
		instruments.add(new Instrument("guitar", "gibson", 100000));
		instruments.add(new Instrument("bass", "fender", 40000));
		
		// COUNT
		// counting total number of elements in the list.
		long totalInstruments = instruments.stream().count();
		System.out.println("Total instruments in the list : " + Long.toString(totalInstruments));
		System.out.println();
		System.out.println();
		
		// MIN
		// getting the instrument with the minimum price from the list.
		Instrument min = instruments.stream().min(Comparator.comparingInt(Instrument::getPrice)).get();
		System.out.println("Instrument with minimum price : " + min.toString());
		System.out.println();
		System.out.println();
		
		// MAX
		// getting the instrument with the maximum price from the list.
		Instrument max = instruments.stream().max(Comparator.comparingInt(Instrument::getPrice)).get();
		System.out.println("Instrument with minimum price : " + max.toString());
		System.out.println();
		System.out.println();
		
		
		// FILTER
		// getting instruments whose price >= 30000
		System.out.println("Instruments with price >= 30000");
		List<String> tempOne = instruments.stream().filter(instrument->instrument.getPrice()>30000).map(i->i.getName() + " " + i.getBrand()).collect(Collectors.toList()); 
		tempOne.forEach(i->System.out.println(i));
		System.out.println();
		System.out.println();
		
		// DISTINCT
		// printing distinct elements in the list
		System.out.println("Printing the distinct instruments in the list");
		List<String> names = instruments.stream().map(Instrument::getName).collect(Collectors.toList());
		List<String> distinct = names.stream().distinct().collect(Collectors.toList());
		distinct.forEach(i -> System.out.println(i));
		System.out.println();
		System.out.println();
		
		// SORTING
		// printing all elements in sorted order according to price
		System.out.println("Printing sorted list by price");
		Collections.sort(instruments, new SortByPrice());
		instruments.forEach(i -> System.out.println(i.toString()));
		System.out.println();
		System.out.println();
	}

}
