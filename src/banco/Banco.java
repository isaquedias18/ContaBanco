package banco;

public class Banco {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(01);
		p1.setDono("Andrey");
		p1.abrirConta("CP");
		
		p1.estadoAtual();
	}
}
