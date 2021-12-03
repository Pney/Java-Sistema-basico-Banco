
public class testeOperadoresLógicos {
	public static void main(String[] args) {
		
		int idade = 18;
		int acompanhado = 1;
		boolean solteiro = acompanhado <= 1;
		
		if(idade >= 18 && solteiro) {
			System.out.println("Seja Bem Vindo!!!");
		} else {
			System.out.println("Não vai entrar ninguém!");
		}
	}
}
