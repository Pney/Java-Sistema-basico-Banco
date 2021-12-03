public class testaMetodos {
	public static void main(String[] args) {
		conta primeiraConta = new conta();
		conta segundaConta = new conta();
		primeiraConta.saldo = 1100;
		System.out.println("Meu antigo saldo era " + primeiraConta.saldo);
		primeiraConta.deposita(200);
		System.out.println("depositei " + primeiraConta.saldo);
		primeiraConta.saca(1000);
		System.out.println("saquei " + primeiraConta.saldo);
		primeiraConta.transfere(100, segundaConta);
		System.out.println("transferi " + primeiraConta.saldo);
		
		System.out.println("---------------------------------------------------");
		
		segundaConta.saldo = 2000;
		System.out.println("Meu atual saldo é " + segundaConta.saldo);
		
		
	}
}
