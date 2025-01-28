package Classes_abstratas;

public class Main {

	public static void main(String[] args) {
		
		FuncionarioCLT c1 = new FuncionarioCLT("Ricardo", 1200, 200);
		c1.Exibir();
		c1.calcularSalario();
		
		FuncionarioPJ p1 = new FuncionarioPJ("Felipe", 1200, 12, 100);
		p1.Exibir();
		p1.calcularSalario();

	}

}
