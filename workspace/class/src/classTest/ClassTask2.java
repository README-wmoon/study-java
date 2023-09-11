package classTest;

import java.util.Scanner;

class Store{
	String name;
	double storePrice;
	int count;
	public Store() {
	}	
	
	public Store(String name, double storePrice, int count) {
		this.name = name;
		this.storePrice = storePrice;
		this.count = count;
	}

	void cellBox(Customer customer) {
		customer.balance -= storePrice * ((100 - customer.disCount) / 0.08);
		count--;
	}
}

class Customer {
	String name;
	String cellPhoneNumber;
	double balance;
	double disCount = 0.08;
	public Customer() {
	}
	
	public Customer(String name, String cellPhoneNumber, double balance, double disCount) {
		this.name = name;
		this.cellPhoneNumber = cellPhoneNumber;
		this.balance = balance;
		this.disCount = disCount;
	}
	
}

public class ClassTask2 {
	public static void main(String[] args) {
		Customer customer = new Customer("우람", "01088845225", 30000, 20);
		Store store = new Store("우유", 5890, 15);
		
		Customer[] arCustomer = {
				new Customer("우람", "01088845225", 30000, 20),
				new Customer("한동석", "0108844555", 40000, 10),
				new Customer("홍길동", "0105353225", 222, 40)
		};
		
		for (int i = 0; i < arCustomer.length; i++) {
			store.cellBox(arCustomer[i]);
			System.out.println(arCustomer[i].balance);			
		}
		
	}
}
