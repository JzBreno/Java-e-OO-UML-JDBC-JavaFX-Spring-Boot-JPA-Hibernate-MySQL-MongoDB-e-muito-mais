package vetorobjeto;

public class Computador implements ProcessosPc{
	private String cpu;
	private String gpu;
	private String mothorBoard;
	private String ram;
	private double valor;
	
	//sobrecarregando construtor
	public Computador() {
		super();
	}

	public Computador(String cpu, String gpu, String mothorBoard, String ram, double valor) {
		super();
		this.cpu = cpu;
		this.gpu = gpu;
		this.mothorBoard = mothorBoard;
		this.ram = ram;
		this.valor = valor;
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}

	@Override
	public void desligar() {
		System.out.println("Desligando");
		
	}

	@Override
	public void reiniciar() {
		System.out.println("Reiniciando");
		
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizando, Não desligue o computador");
		
	}
	@Override
	public String toString() {
		return "Computador [cpu=" + cpu + ", gpu=" + gpu + ", mothorBoard=" + mothorBoard + ", ram=" + ram + ", valor="
				+ valor + "]";
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getMothorBoard() {
		return mothorBoard;
	}

	public void setMothorBoard(String mothorBoard) {
		this.mothorBoard = mothorBoard;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
