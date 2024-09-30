package restrições_convenções_para_nomes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 89;
		int y = 60;
		System.out.println(x & y);
		//comparando bit a bit com &
		// 0101 1001 ->comparando bit a bit
		// 0011 1101 ->0001 1000 (24)
		System.out.println(x | y);
		//comparando bit a bit com ^
		// 0101 1001 ->comparando bit a bit
		// 0011 1101 ->0110 0101 (101)
		System.out.println(x^ y);
	}

}
