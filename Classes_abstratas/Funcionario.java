package Classes_abstratas;

public abstract class Funcionario {

	protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    
    public void Exibir() {
    	System.out.println("o nome do funcionario " + this.nome);
    	System.out.println("o salario base do funcionario " + this.salarioBase);
    }
}
