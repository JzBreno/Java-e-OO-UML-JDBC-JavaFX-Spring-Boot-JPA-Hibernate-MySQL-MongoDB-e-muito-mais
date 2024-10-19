package primeiro_Trabalho_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		//usando metodo static para mostrar exemplos
		ChamadasVoidDate.Mostrar();
		//instanciando objeto desse tipo com formato especificado, servira para instanciarmos datas com esse formato de string
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		//instanciando com o nosso formato criado e nossa strinf recebida
		System.out.println(LocalDate.parse("20/07/2022", fm));
		//com hora agora
		System.out.println(LocalDateTime.parse("20/07/2022 01:00", fm2));
		//instanciando separado
		System.out.println(LocalDate.of(2024, 10, 19));

	}

}
