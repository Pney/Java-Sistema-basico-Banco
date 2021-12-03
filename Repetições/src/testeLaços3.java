public class testeLaços3 {
	public static void main(String[] args) {
		for(int linha = 0; linha <= 10; linha++) {
			for(int coluna = 0; coluna <= linha; coluna++){
			
				System.out.print("*");
			}	
			System.out.println();
		}
	}
}
//linha = 0, linha(true)
//coluna = 0, coluna(true), coluna = 1;
//coluna = 1, coluna(false);		linha = 1;

//linha = 1, linha(true)
//coluna = 0, coluna(true), coluna = 1;
//coluna = 1, coluna(true), coluna = 2;
//coluna = 2, coluna(false); 		linha = 2;

//linha = 2, linha(true)
//coluna = 0, coluna(true), coluna = 1;
//coluna = 1, coluna(true), coluna = 2;
//coluna = 2, coluna(true), coluna = 3;
//coluna = 3, coluna(false); 		linha = 3;

//linha = 3, linha(true)
//coluna = 0, coluna(true), coluna = 1;
//coluna = 1, coluna(true), coluna = 2;
//coluna = 2, coluna(true), coluna = 3;
//coluna = 3, coluna(true), coluna = 4;
//coluna = 4, coluna(false);		 linha = 4;
