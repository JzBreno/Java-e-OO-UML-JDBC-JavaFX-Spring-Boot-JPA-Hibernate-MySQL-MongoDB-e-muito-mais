package vetorobjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//selecionando tamanho da nossa list
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do Vetor");
		int Numero = scan.nextInt();
		//inciando nossa list do tipo computador
		ArrayList<Computador> comp = new ArrayList<Computador>() ;
		//iremos usar a função add inserindo um objeto do tipo computador
		for (int i=0; i<=Numero;i++) {
			comp.add(new Computador("xeon","6600","teste","16gb",1));
		}
		//percorrendo e printando com indices
		//melhor forma de iterar sobre listas
		for(Computador comps : comp) {
			System.out.println(comps);
		}
		//listas de integer 
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			Random random = new Random();
			lista.add(random.nextInt(0,101));
		}
		
		for(Integer list : lista) {
			System.out.println(list);
		}
		
		
		
		scan.close();

	}

}
