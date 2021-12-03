public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	//CONSTRUTOR
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;//Ou seja toda conta começa com 100 reais.
		System.out.println("Estou criando uma conta");
		System.out.println(total);
		total++;
	}
	
	//Getters & MÉTODOS - SALDO
	public double getSaldo() {
		return saldo;
	}
	public void saca(double valor) {
		if(valor > 0 && saldo >= valor) {
			saldo-= valor;
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
	
	//Getter&Setter - TOTAL
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Conta.total = total;
	}
}
