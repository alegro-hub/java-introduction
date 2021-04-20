package chapter14;

public class Account {
	private String accounNumber;
	private int balance;

	public Account(String accountNumber,int balance) {
		this.accounNumber = accountNumber;
		this.balance = balance;
	}

	public String toString() {
		return "\\"+this.balance+"（口座番号："+this.accounNumber+"）";
	}

}
