
public class testaCaracteres {
	public static void main(String[] args) {
		
		char letra = 'A';
		System.out.println(letra);
		
		char valor = 65;	 //Se fosse 65 daria o resultado A. Cada numero � uma letra.
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String frase = ("O n�mero de gados que j� conseguimos chegar � de: ");
		System.out.println(frase + 2020);
	}
}
