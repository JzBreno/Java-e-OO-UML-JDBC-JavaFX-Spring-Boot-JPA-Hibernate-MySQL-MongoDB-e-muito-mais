package Funcionario;

public class Funcionario extends Pessoa{
	
	private  double salarioBruto;
	private  double imposto;
	
	
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, double salarioBruto, double imposto) {
		super();
		this.setNome(nome);
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}
	
	

	@Override
	public String toString() {
		return "Funcionario [salarioBruto=" + salarioBruto + ", imposto=" + imposto + ", getNome()=" + getNome() + "]";
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}

	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}

	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return super.getAltura();
	}

	@Override
	public void setAltura(double altura) {
		// TODO Auto-generated method stub
		super.setAltura(altura);
	}

	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return super.getPeso();
	}

	@Override
	public void setPeso(double peso) {
		// TODO Auto-generated method stub
		super.setPeso(peso);
	}
	//metodo nao static que se chama no objeto
	public double salarioLiquido() {
		return (this.salarioBruto - this.imposto);
	} 
	//metodo static que se chama apartir da classe
	public static double salarioLiquido(double salarioBruto, double imposto) {
		return (salarioBruto - imposto);
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	
	
}
