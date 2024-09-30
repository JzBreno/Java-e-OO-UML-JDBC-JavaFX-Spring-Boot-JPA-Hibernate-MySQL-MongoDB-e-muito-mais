package Funcionario;

public class Main {

	public static void main(String[] args) {
		//Fazendo funcionario em Poo
		Funcionario funcionario = new Funcionario();
		funcionario.setImposto(2000);
		funcionario.setNome("Jose Breno Sousa Jacauna");
		funcionario.setSalarioBruto(7000);
		System.out.println(funcionario);
		System.out.println(funcionario.salarioLiquido());
		funcionario.setNome("Breno Sousa");
		System.out.println(funcionario);
		System.out.println(funcionario.salarioLiquido(3000,400));
	}

}
