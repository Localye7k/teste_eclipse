package entities;

public class BankAccount {
	
	private String name;
	private int BankNumber;
	private double Saldo;
	private double DepositoInicial;
	
	
	public double DepositoInicial(double DepositoInicial, double Saldo) {
		double novoSaldo = Saldo + DepositoInicial;
		return novoSaldo;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBankNumber() {
		return BankNumber;
	}


	public double getSaldo() {
		return Saldo;
	}

	public double getDepositoInicial() {
		return DepositoInicial;
	}


	public void setDepositoInicial(double depositoInicial) {
		DepositoInicial = depositoInicial;
	}
	
	
	

}
