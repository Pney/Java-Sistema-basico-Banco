public class personagem {
	public static void main(String[] args) {
		
		caracteristicas character = new caracteristicas();
		
		character.altura = 1.70;
		character.idade = 17;
		character.nome = "Jorgin";
		
		System.out.println("Minha altura � " + character.altura + " enquanto a minha idade � " + character.idade);
		character.altura += 0.05;
		System.out.println("Mais expecificamente " + character.altura);
		
		System.out.println("----------------------------------------------");
		
		caracteristicas character2 = new caracteristicas();
		
		character2.altura = 1.60;
		character2.idade = 16;
		
		System.out.println("Minha Altura � " + character2.altura + " enquanto a minha idade � " + character2.idade);
		character2.nome = "Taiga";
		System.out.println(character2.nome);
		
		
	}
}
