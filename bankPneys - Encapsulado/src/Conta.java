public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//Getter&MÉTODOS - SALDO
	public double getSaldo() {
		return saldo;
	}
	public void saca(double valor) {
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;
		}
	}
	public void deposita(double valor) {
		if(valor >= 0) {
			saldo += valor;
		}
	}
	
	//Getter&Setter - AGENCIA
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	//Getter&Setter - NÚMERO
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Getter&Setter - TITULAR
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
