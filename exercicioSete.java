
import java.util.Scanner;

public class exercicioSete {
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a primeira nota da avalia��o:"); 
		float NotaUm = scan.nextInt();
			
		System.out.println("Informe a primeira segunda da avalia��o:"); 
		float NotaDois = scan.nextInt();
			
		System.out.println("Informe a primeira terceira da avalia��o:"); 
		float NotaTres = scan.nextInt();
			
		float mediaFinal = (NotaUm + NotaDois + NotaTres)/3;
						
		if (mediaFinal>=7){
			System.out.println("Voc� foi aprovado."); 
			System.out.println("A m�dia �:" + mediaFinal ); 
		}else{
				System.out.println("Voc� foi reprovado."); 
		     }
	}
}


