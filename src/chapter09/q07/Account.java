package chapter09.q07;

import java.util.Date;

public class Account {
	
	//data-fields
	int id;
	double balance;
	double annualInterestRate;
	private Date dateCreated;
	
	//no-arg constructor
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	Account(int newId, double newBalance, double newInterest){
		id = newId;
		balance = newBalance;
		annualInterestRate = newInterest;
		dateCreated = new Date();
	}
	
	//Accessor methods
	double getId() {
		return id;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	String getDateCreated() {
		return dateCreated.toString();
	}
	
	//mutator methods
	public void setId(int newId) {
		id = newId;
	}
	
	public void setBalance(int newBalance) {
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(int newInterest) {
		annualInterestRate = newInterest;
	}
	
	Date getDate() {
		return dateCreated;
	}
	
	//METHODS
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}
	
	void deposit(int amount) {
		balance += amount;
	}

}
