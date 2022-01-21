import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class exercicioCinco {
	
	 private static final String Date = null;

	 public static void main(String[] args) {
			
		 Scanner scan = new Scanner(System.in);
			
		 System.out.println("Informe o ano do seu nascimento:"); 
		 int ano = scan.nextInt();
			
		 System.out.println("Informe o mes do seu nascimento:"); 
		 int mes = scan.nextInt();
		 System.out.println("Informe o dia do seu nascimento:"); 
		 int dia = scan.nextInt();
			
		 LocalDateTime agora = LocalDateTime.now();
			
		 DateTimeFormatter formatarMes = DateTimeFormatter.ofPattern("MM");
		 String mesAtual = formatarMes.format(agora);
		 DateTimeFormatter formatarAno = DateTimeFormatter.ofPattern("yyyy");
		 String anoAtual = formatarAno.format(agora);
			
		 int anoConvertido = Integer.parseInt(anoAtual);
		 int mesConvertido = Integer.parseInt(mesAtual);
		 int resAno = anoConvertido - ano;
         int resultado = (dia+(resAno*365)+(mes*30));
			
		 System.out.println("O resultado é " + resultado + " dias"); 
	}
}


