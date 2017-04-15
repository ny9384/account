package °èÁÂ;

public class Car implements Valuable{
	private final double buyFactor=0.8;
	private String name;
	private double price;
	private double value;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
		value=price*buyFactor;
	}
	
	public double estimateValue(int month){
		for(int i=0;i<month;i++){
			value *= 0.99;
		}
		return value;
		}
	
	@Override
	public String toString(){
		return "car name:"+name+"\n"+"initial price:"+Double.toString(price);
	}
}