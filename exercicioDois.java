import java.util.Scanner;

public class exercicioDois {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um valor:"); 
		int valor = scan.nextInt();
		valor = valor - 1;
		System.out.println("O antecessor é :" + valor); 
	}
}
