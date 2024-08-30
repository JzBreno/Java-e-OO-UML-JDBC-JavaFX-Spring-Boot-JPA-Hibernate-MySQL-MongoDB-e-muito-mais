package curso_java_programacao;

public class motor {
	private int potencia;
	private int cilindrada;
	
	public void exibir() {
		System.out.printf("Motor de %d Cilindradas e %d de Potencia",cilindrada, potencia);
	}
	
	motor(int pot, int cil){
		this.potencia = pot;
		this.cilindrada = cil;
	}
	
}
