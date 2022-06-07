package java_classes_methods;

public class Bank{
	  private CheckingAccount accountOne;
	  private CheckingAccount accountTwo;

	  public Bank(){
	    accountOne = new CheckingAccount("Zeus", 100, "1");
	    accountTwo = new CheckingAccount("Hades", 200, "2");
	  }

	  public static void main(String[] args){
	    Bank bankOfGods = new Bank();
	    System.out.println(bankOfGods.accountOne.name);
	    bankOfGods.accountOne.addFunds(5);
	    bankOfGods.accountOne.getInfo();

	  }

	}
/*
public class Bank{
private CheckingAccount accountOne;
private CheckingAccount accountTwo;

public Bank(){
  accountOne = new CheckingAccount("Zeus", 100);
  accountTwo = new CheckingAccount("Hades", 200);
}

public static void main(String[] args){
  Bank bankOfGods = new Bank();
  System.out.println(bankOfGods.accountOne.name);
  bankOfGods.accountOne.addFunds(5);
  bankOfGods.accountOne.getInfo();

}

}
*/
/*
public class Bank{
private CheckingAccount accountOne;
private CheckingAccount accountTwo;

public Bank(){
  accountOne = new CheckingAccount("Zeus", 100, "1");
  accountTwo = new CheckingAccount("Hades", 200, "2");
}

public static void main(String[] args){
  Bank bankOfGods = new Bank();
  System.out.println(bankOfGods.accountOne.getBalance());
  bankOfGods.accountOne.setBalance(5000);
  System.out.println(bankOfGods.accountOne.getBalance());
}

}
*/
/*
public class Bank{
private CheckingAccount accountOne;
private CheckingAccount accountTwo;

public Bank(){
  this.accountOne = new CheckingAccount("Zeus", 100, "1");
  this.accountTwo = new CheckingAccount("Hades", 200, "2");
}

public static void main(String[] args){
  Bank bankOfGods = new Bank();
  bankOfGods.accountOne.getAccountInformation();
  bankOfGods.accountOne.calculateNextMonthInterest();
}

}
*/
/*
public class Bank{
private CheckingAccount accountOne;
private CheckingAccount accountTwo;

public Bank(){
  accountOne = new CheckingAccount("Zeus", 100, "1");
  accountTwo = new CheckingAccount("Hades", 200, "2");
}

public static void main(String[] args){
  Bank bankOfGods = new Bank();
  System.out.println(bankOfGods.accountOne.getBalance());
  bankOfGods.accountOne.setBalance(5000);
  System.out.println(bankOfGods.accountOne.getBalance());
  System.out.println(bankOfGods.accountOne.getMonthlyInterest());

}

}
*/