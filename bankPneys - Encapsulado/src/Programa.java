

public class Programa {
	public static void main(String[] args) {
		//INFORMAÇÕES DA CONTA
		Conta conta = new Conta();
		conta.setNumero(1500);
		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
		cliente.setNome("Beterrabinha");
		System.out.println(cliente.getNome());
		
		cliente.setCargo("Pescador");
		System.out.println(cliente.getCargo());
		
		cliente.setCpf(12017005908L);
		System.out.println(cliente.getCpf());
		
		//DEPOSITOS E SAQUES
		conta.deposita(1800);
		conta.saca(100);
		System.out.println(conta.getSaldo());
		
		conta.deposita(301);
		System.out.println(conta.getSaldo());
		
		conta.saca(2000);
		System.out.println(conta.getSaldo());
		
		
	}
}
