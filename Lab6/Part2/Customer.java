import java.util.*;
import java.util.Enumeration;

public class Customer {

	private String name;
	private String address;
	private Hashtable hash_account;

	public Customer(String xname, String xaddress) {
		name = xname;
		address = xaddress;
		hash_account = new Hashtable();
		System.out.println("Customer: " + xname + " " + "is created.");
	}

	public void addAccount(Account xaccount) {
		// System.out.println("hash size : " + hash_account.size());
		hash_account.put(xaccount.getAccountNumber(), xaccount);
		System.out.println("--- add account : " + xaccount.getAccountNumber());
		// System.out.println("hash size : " + hash_account.size());
	}

	public void removeAccount(Account xaccount) {
		// System.out.println("hash size : " + hash_account.size());
		hash_account.remove(xaccount.getAccountNumber());
		System.out.println("--- remove account : " + xaccount.getAccountNumber());
		// System.out.println("hash size : " + hash_account.size());
	}

	public Enumeration getAllAccounts() {
		return hash_account.elements();
	}

	public Account getAccount(String xaccountNumber) {
		Account x = (Account) hash_account.get(xaccountNumber);
		// System.out.println("get account : " + x.getAccountNumber());
		return x;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

} // Customer.java
