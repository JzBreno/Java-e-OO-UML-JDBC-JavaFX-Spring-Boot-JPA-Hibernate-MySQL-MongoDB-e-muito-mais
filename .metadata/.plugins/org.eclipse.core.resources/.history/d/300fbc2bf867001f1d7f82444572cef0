package curso_java_programacao;

public class ehprimo {
	
	private static int numero;
	
	
	ehprimo(int number){
		this.numero = number;
	}
	
	public void exibir() {
		System.out.println(verificaprimo(numero+1));
	}
	
	public int proxiprimo() {
		int proximo = numero +1;
		while(!verificaprimo(proximo)) {
			proximo++;
		}
		return proximo;
	}
	
	 private boolean verificaprimo(int proximo){
		 if(proximo <= 1) {
			 return false;
		 }
		 
		 for(int i=2;i<=Math.sqrt(proximo);i++) {
			 if(proximo % i ==0) {
				 return false;
			 }
		 }
		 return true;
		
	}
}
