package bankPneys;

public class Programa {
	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.titular = new Cliente();

		conta.titular.nome= "Thiago";
		System.out.println(conta.titular.nome);

	}
}
