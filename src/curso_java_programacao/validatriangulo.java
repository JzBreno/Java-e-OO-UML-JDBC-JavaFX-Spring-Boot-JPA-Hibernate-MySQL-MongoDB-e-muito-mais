package curso_java_programacao;
//questao 1
public class validatriangulo {
	private int a;
	private int b;
	private int c;
	
	validatriangulo(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void ehtriangulo(){
		boolean flag = false;
		if((a+b) > c && (b+c)>a && (a+c)>b) {
			flag = true;
			System.out.print(flag);
		}else {
			System.out.print(flag);
		}
			
	}
	
}
