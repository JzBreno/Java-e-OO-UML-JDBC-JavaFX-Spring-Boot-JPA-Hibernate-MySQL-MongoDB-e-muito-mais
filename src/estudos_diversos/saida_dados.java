package estudos_diversos;

import java.util.Scanner;

public class saida_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para entrada de dados precisamos de umobjeto do tipo scanner
		Scanner leia = new Scanner(System.in);
		//lendo dados que nao terao espaços aos lados
		String x = leia.next();
		//so ira ler tudo que estiver antes do primeiro
		System.out.println(x);
		//lendo numero inteiro
		int i = leia.nextInt();
		System.out.println(i);
		//lendo numero com ponrto flutuandte
		System.out.print("ola");
		double d = leia.nextDouble();
		System.out.println(d);
		// digitar varias coisas em uma linha
		String str;
		int k;
		double o;
		str = leia.next();
		k = leia.nextInt();
		o = leia.nextDouble();
		
		System.out.println("dados: ");
		System.out.println(str);
		System.out.println(k);
		System.out.println(o);
		leia.close();
	}

}
