package ����;

public class Human implements Valuable{
	private String name;
	private int age;
	
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	public double EstimateValue(int month){
		return Double.POSITIVE_INFINITY;
	}
	public String tostring(){
		return String.format("Human name:%s\nregistered age:%d",name,age);
	}

}
