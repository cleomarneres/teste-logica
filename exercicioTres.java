import java.util.Scanner;

public class exercicioTres {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um valor:"); 
		int valor = scan.nextInt();
		
		if (valor>=10) {
			System.out.println("� MAIOR QUE 10! OU IGUAL A 10.");
		}else {
			System.out.println("N�O � MAIOR QUE 10!");
		}
	}
}
