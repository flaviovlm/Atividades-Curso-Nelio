package entities;

public class Account {

	private final int numberAccount;
	private String nameHolder;
	private double balance;
	public static final double TAX = 5.00;

	public Account(int numberAccount, String nameHolder, double balance) {
		this.numberAccount = numberAccount;
		this.nameHolder = nameHolder;
		this.balance = balance;
	}

	public Account(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.nameHolder = holder;
	}

	public int getNumberAccount() {
		return numberAccount;
	}


	public String getHolder() {
		return nameHolder;
	}

	public void setHolder(String holder) {
		this.nameHolder = holder;
	}

	public double getBalance() {
		return balance;
	}


	@Override
	public String toString() {
		return "Account " + numberAccount +
				", Holder: " + nameHolder +
				", Balance: $ " + balance;
	}

	public void deposit (double valueDeposits){
		this.balance += valueDeposits;
	}

	public void withdraw (double valueWithdraw){
		this.balance -= valueWithdraw + TAX;
	}
}
