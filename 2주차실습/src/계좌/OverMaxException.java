package ����;

public class OverMaxException extends Exception{
	public String toString(){
		return "Debit amount exceeded account balance.";
	}
}
