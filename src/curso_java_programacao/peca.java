package curso_java_programacao;

public class peca {
	private String descricao;
	private String marca;
	
	peca(String desc, String marca){
		this.descricao = desc;
		this.marca = marca;
	}
	
	public void exibir() {
		System.out.printf("Marca: %snDescrição: %s%n", marca, descricao);
	}
}
