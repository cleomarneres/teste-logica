import java.util.Scanner;

public class exercicioSeis {
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o numero de Eleitores:"); 
		float TotalEleitores = scan.nextInt();
			
		System.out.println("Informe o numero de votos brancos:"); 
		float VotoBranco = scan.nextInt();
			
		System.out.println("Informe o numero de votos nulos:"); 
		float VotoNulo = scan.nextInt();
			
		System.out.println("Informe o numero de votos válidos.:"); 
		float VotoValido = scan.nextInt();

		float percBranco = 100*(VotoBranco/TotalEleitores);
		float percNulo = 100*(VotoNulo/TotalEleitores);
		float percValido = 100*(VotoValido/TotalEleitores);
			
		System.out.println("O porcentagem de votos brancos é: " + percBranco);
		System.out.println("O porcentagem de votos nulos é: " + percNulo);
		System.out.println("O porcentagem de votos validos é: " + percValido); 	
	}
}


