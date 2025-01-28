package Classes_abstratas;

public class FuncionarioCLT extends Funcionario {

	 private double bonus;

	    public FuncionarioCLT(String nome, double salarioBase, double bonus) {
	        super(nome, salarioBase);
	        this.bonus = bonus;
	    }

	    @Override
	    public double calcularSalario() {
	        return salarioBase + bonus;
	    }
	    @Override
	    public void Exibir() {
	    	super.Exibir();
	    	System.out.println("o bonus de trabalho " + this.bonus);
	    }
}
