package vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//usando scanner
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//criando vetor de double
		double[] lista = new double[num];
		//percorrendo vetor de doubles e printando
		for(int i=0;i<lista.length;i++) {
			lista[i] = i;
			System.out.printf("teste: "+ lista[i]);
		}
		//fechando scanner
		scan.close();
	}

}
