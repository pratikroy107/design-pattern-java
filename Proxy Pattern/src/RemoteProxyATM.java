//has 4 types : virtual, protective, remote, smart
//this is REMOTE PROXY; another file has PROTECTIVE PROXY

interface Account {
	public void withdraw();

	void getAccountNumber();
}

class BankAccount implements Account {
	@Override
	public void withdraw() {
		System.out.println("money withdrawn!!");
	}

	@Override
	public void getAccountNumber() {
		System.out.println("getting account number!!");
	}
}

class ATM implements Account { // This is proxy to bank account object not real
	
	BankAccount ba;
	
	@Override
	public void withdraw() {
		// Access using actual object. You can also have checks on withdraw to achieve
		// authentication or pin is correct or not.
		ba = new BankAccount();
		ba.withdraw();
	}

	@Override
	public void getAccountNumber() {
		ba.getAccountNumber();
	}
}

public class RemoteProxyATM {
	public static void main(String[] args)
	{
		ATM atm = new ATM();
		atm.withdraw();
		atm.getAccountNumber();
	}
}