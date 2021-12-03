
public class testaCaracteres {
	public static void main(String[] args) {
		
		char letra = 'A';
		System.out.println(letra);
		
		char valor = 65;	 //Se fosse 65 daria o resultado A. Cada numero é uma letra.
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String frase = ("O número de gados que já conseguimos chegar é de: ");
		System.out.println(frase + 2020);
	}
}
