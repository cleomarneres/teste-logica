import java.util.Scanner;

public class exercicioQuatro {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o salario:"); 
		float salario = scan.nextInt();
		
		System.out.println("Informe o o percentual de reajuste:"); 
		float percentual = scan.nextInt();
		
		float resultado =  salario + (salario * (percentual/100));
		System.out.println("O resultado é " + resultado); 
	}
}
