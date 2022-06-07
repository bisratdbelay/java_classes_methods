package java_classes_methods;

public class CheckingAccount{
	  public String name;
	  private int balance;
	  private String id;

	  public CheckingAccount(String inputName, int inputBalance, String inputId){
	    name = inputName;
	    balance = inputBalance;
	    id = inputId;
	  }

	  public void addFunds(int fundsToAdd){
	    balance += fundsToAdd;
	  }

	  public void getInfo(){
	    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
	  }

	}
/*
public class CheckingAccount{
private String name;
private int balance;

public CheckingAccount(String inputName, int inputBalance){
  name = inputName;
  balance = inputBalance;
}

private void addFunds(int fundsToAdd){
  balance += fundsToAdd;
}

private void getInfo(){
  System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
}

public static void main(String[] args){
  CheckingAccount myAccount = new CheckingAccount("Bisrat", 10000);
  System.out.println(myAccount.balance);
  myAccount.addFunds(5);
  System.out.println(myAccount.balance);
}

}
*/
/*
public class CheckingAccount{
private String name;
private int balance;
private String id;

public CheckingAccount(String inputName, int inputBalance, String inputId){
  name = inputName;
  balance = inputBalance;
  id = inputId;
}

//Write new methods here:
public int getBalance() {
  return this.balance;
}
public void setBalance(int newBalance) {
  this.balance = newBalance;
}
}
*/
/*
public class CheckingAccount{
private String name;
private int balance;
private String id;
private double interestRate;

public CheckingAccount(String inputName, int inputBalance, String inputId){
  this.name = inputName;
  this.balance = inputBalance;
  this.id = inputId;
  this.interestRate = 0.02;
}

public void getAccountInformation(){
  System.out.println("Money in account: " + this.getBalance());
  System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());

}

private int getBalance(){
  return this.balance;
}

// Write the calculateNextMonthInterest() here
private double calculateNextMonthInterest(){
  return this.interestRate * this.balance;
}
}
*/
/*
public class CheckingAccount{
private String name;
private int balance;
private String id;
private double interestRate;

public CheckingAccount(String inputName, int inputBalance, String inputId){
  this.name = inputName;
  this.balance = inputBalance;
  this.id = inputId;
  this.interestRate = 0.02;
}

public int getBalance(){
  return this.balance;
}

public void setBalance(int newBalance){
  this.balance = newBalance;
}

public double getMonthlyInterest(){
  return this.interestRate * this.balance;
}

}
*/