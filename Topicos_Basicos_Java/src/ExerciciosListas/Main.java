package ExerciciosListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//fazer duas listas de tamanho 5 e 8
//o que for igual sera armazenada em uma terceira lista
public class Main {

	public static void main(String[] args) {
		//nossas 3 listas que utilizaremos para a logica
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();
		//ira incrementar nossos valores de formas randomicas
		Random random = new Random();
		//incrementando a lista de tamanho 5
		for(int i=0;i<5;i++) {
			lista.add(random.nextInt(0,19));
		}
		//incrementando lista de tamanho 8
		for(int i=0;i<8;i++) {
			lista2.add(random.nextInt(0,19));
		}
		//percorrendo as listas e incrementando a nossa lista c com os valores iguais
		for(int i=0;i<5;i++) {
			for(int j=0;j<8;j++) {
				if(lista.get(i) == lista2.get(j)) {
					C.add(lista2.get(j));
				}
			}
		}
		//printando c com for each
		for(int c:C) {
			System.out.println(c);
		}
		

	}

}
