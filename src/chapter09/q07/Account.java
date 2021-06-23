package chapter09.q07;

import java.util.Date;

public class Account {
	//data-fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//no-arg constructor
	public Account(){
		this(0, 0);
		this.annualInterestRate = 0;
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	//METHODS
	public double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
}
