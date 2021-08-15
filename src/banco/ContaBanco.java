package banco;

public class ContaBanco {
	
	/*Atributos*/
	private int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	/*Métodos*/
	public void estadoAtual() {
		System.out.println("===========================================================");
		System.out.println("Conta: " + this.numConta);
		System.out.println("Tipo da Conta: " + this.tipo);
		System.out.println("Dono da Conta: " + this.dono);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Status: " + this.status);
	}
	
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if(t == "CC") {
			this.setSaldo(50);
			
		}else if(t == "CP"){
			this.setSaldo(150);
			
		}
		System.out.println("Conta aberta com Sucesso!");
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada");
			
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta em Débito");
			
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com Sucesso!");
		}
	}
	
	public void depositar(double v) {
		if(this.getStatus()) {
			this.setSaldo(getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
		
	}	
	
	public void sacar(double v) {
		if(this.getStatus()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo Insuficiente para saque");
			}
		}else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensal() {/*Pagar Mensalidade*/
		int v = 0;
		
		if(this.getTipo() == "CC") {
			v = 12;
		}else if(this.getTipo() == "CP") {
			v = 20;
		}
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}else {
			System.out.println("Impossível pagar uma conta fechada");
		}
	}
	
	/*Métodos Especiais*/
	public ContaBanco() {/*Método Contrutor*/
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double s) {
		this.saldo = s;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean st) {
		this.status = st;
	}
	
	
	
	
	
	
	
	
	
}
