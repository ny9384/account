package °èÁÂ;

import java.util.jar.Attributes.Name;

public class Car implements Valuable{
	private double price;
	private String name;
	
	public Car(String name, double price){
		this.name=name;
		this.price=price;
	}
	public double EstimateValue(int month){
		price=price*0.8;
		return price=(price*Math.pow(0.99, month));
	}
	public String toString(){
		return String.format("Car name:%s\nintial price:%.2f", name,price);
	}
}