package curso_java_programacao;

public class polidromo {
	private String palavra;
	private int esquerda;
	private int direita; 
	
	polidromo(String word){
		this.palavra = word;
		this.direita = word.length() - 1;
		this.esquerda = 0;
	}
	
	public void exibir() {
		System.out.printf("palavra: %s%n esquerda: %d%n direita: %d%n", palavra, esquerda, direita);
	}
	
	public void exibirehpolidromo() {
		System.out.print(ehpolidromo());
	}
	
	public boolean ehpolidromo() {
		while(direita > esquerda) {
			if(palavra.charAt(esquerda) != palavra.charAt(direita)) {
				return false;
			}else{
			}
			direita--;
			esquerda++;
		}
		return true;
	}
}
