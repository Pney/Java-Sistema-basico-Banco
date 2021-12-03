
public class exercicio1 {
	public static void main(String[] args) {
		double ir;
		double salario = 3300.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			ir = 7.5;
			System.out.println("Seu ir é " + ir + "%" + " em torno de R$142" );
		} 
		
		if(salario > 2800.01 && salario <= 3751.0) {
			ir = 15;
			System.out.println("Seu ir é " + ir + "%" + " em torno de R$350" );
		}
		
		if (salario > 3751.01 && salario <= 4664.0) {
			ir = 22.5;
			System.out.println("Seu ir é " + ir + "%" + " em torno de R$636" );
		}
	}
}
