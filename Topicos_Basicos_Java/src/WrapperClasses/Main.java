package WrapperClasses;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("digite o tamanho do Array: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		Random random = new Random();
		for(int i=0;i < mat.length;i++){
			for(int j=0;j<mat.length;j++) {
				mat[i][j] = random.nextInt(0,101);
			}
		}
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				System.out.println(mat[i][j]);
			}
		}

	}

}
