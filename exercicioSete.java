
import java.util.Scanner;

public class exercicioSete {
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a primeira nota da avaliação:"); 
		float NotaUm = scan.nextInt();
			
		System.out.println("Informe a primeira segunda da avaliação:"); 
		float NotaDois = scan.nextInt();
			
		System.out.println("Informe a primeira terceira da avaliação:"); 
		float NotaTres = scan.nextInt();
			
		float mediaFinal = (NotaUm + NotaDois + NotaTres)/3;
						
		if (mediaFinal>=7){
			System.out.println("Você foi aprovado."); 
			System.out.println("A média é:" + mediaFinal ); 
		}else{
				System.out.println("Você foi reprovado."); 
		     }
	}
}


