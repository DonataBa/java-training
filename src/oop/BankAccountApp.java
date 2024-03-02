package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("123456789", 1000);
		BankAccount acc2 = new BankAccount("543435355", 2500);
		BankAccount acc3 = new BankAccount("764534545", 3000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(600);
		acc1.makeDeposit(1000);
		acc1.payBill(800);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}
	


}

class BankAccount implements IInterest{
	//Properties of bank account
	private static int iD = 1000;                  // Internal ID, we're making it static, so it would be class variable, not object
	private String accountNumber;                  //ID + random 2-digit number + first 2 of SNN
	private static final String routingNumber = "005233412";                  // same for all objects, so static final
	private String name;
	private String SSN;
	double balance;
	
	//Constructors
	public BankAccount(String SSN, double initDeposit){
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	//Method to generate account number, not accessible to client
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + ""+random + SSN.substring(0,2);
		System.out.println("Your Account Number: "+accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance-amount;
		System.out.println("Paying bill: "+amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance+amount;
		System.out.println("Making deposit: "+amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: "+balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1+rate/100);   //rate comes form interface
		showBalance();
	}
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Accouunt Number: " + accountNumber + "]\n[Routing Number: "+routingNumber + "]\n" +
	"[Balance: "+balance+"]";
		
	}
}






