public class forExercicios {
	public static void main(String[] args) {
		
		int numero = 1;
		int quantidade = numero;
		
		for(int multiplicadores = 0; multiplicadores < quantidade; multiplicadores++) {
			for(numero = 0; numero <= 100; numero++) {
				
				if(numero % 3 == 0) {
					System.out.println(numero);
					
				}
			}
		}
	}
}