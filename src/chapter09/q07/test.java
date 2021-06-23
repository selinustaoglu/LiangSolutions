package chapter09.q07;

public class test {

	public static void main(String[] args) {
		
		Account account = new Account(1122, 20000, 4.5);
		
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("Current balance: " + account.getBalance());
		System.out.println("The monthly interest: " + account.getMonthlyInterest());
		System.out.println("The date that this account was created: " + account.getDateCreated());
	}

}
