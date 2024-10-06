package ExerciciosListas;

import java.util.Random;

public class MediaDosValores {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lista = new int[15];
		int media = 0;
		//esse codigo faz a media dos valores 
		for(int i=0;i<15;i++) {
			lista[i] = random.nextInt(0,50);
			media += lista[i];
			if(i==14) {
				media = media / 15;
				System.out.println(media);
			}
		}
		
		
		
	}

}
