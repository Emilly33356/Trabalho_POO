package Classes_abstratas;

public class FuncionarioPJ extends Funcionario {

	 private int horasTrabalhadas;
	    private double valorHora;

	    public FuncionarioPJ(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
	        super(nome, salarioBase);
	        this.horasTrabalhadas = horasTrabalhadas;
	        this.valorHora = valorHora;
	    }

	    @Override
	    public double calcularSalario() {
	        return horasTrabalhadas * valorHora;
	    }
	    @Override
	    public void Exibir() {
	    	super.Exibir();
	    	System.out.println("horas trabalhadas " + this.horasTrabalhadas);
	    	System.out.println("valor por horas trabalhadas " + this.valorHora);
	    }
}
