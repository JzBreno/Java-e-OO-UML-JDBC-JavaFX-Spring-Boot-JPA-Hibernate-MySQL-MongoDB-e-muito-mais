package estudos_diversos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		lerquebradelinha objler = new lerquebradelinha();
		objler.leratequebra(scan);
		objler.exibir();
		scan.close();
	}

}
