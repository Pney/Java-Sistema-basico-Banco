
public class testaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 30;
		int quantidadePessoas = 4;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			 acompanhado = true;
		} else {
			 acompanhado = false;
		}
		
		if (idade >=18 || acompanhado) {
			System.out.println("Entra ae arrombado");
		} else {
			System.out.println("Cai fora daqui");
		}
	}
}
