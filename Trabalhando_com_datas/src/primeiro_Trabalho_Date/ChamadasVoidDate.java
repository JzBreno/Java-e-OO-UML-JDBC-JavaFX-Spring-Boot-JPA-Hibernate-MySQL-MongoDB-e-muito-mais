package primeiro_Trabalho_Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ChamadasVoidDate {
	public static void Mostrar() {
		// TODO Auto-generated method stub
				//Intanciando apartir da data Atual
				System.out.println("data Atual Brasil: "+LocalDate.now());
				//data e hora de agora
				System.out.println("data e hora atual Brasil: "+LocalDateTime.now());
				//hora com fusos, se usa instant
				System.out.println("Data em londres com simbolo: "+Instant.now());
				//instanciando tipo data com string de entrada
				System.out.println("inserindo string para formato de data: "+LocalDate.parse("2022-07-20"));
				System.out.println("inserindo string para formato de data e hora: "+LocalDateTime.parse("2022-07-20T01:08:56"));
				System.out.println("inserindo string para formato de data e hora: "+Instant.parse("2022-07-20T01:08:56Z"));

	}
}
