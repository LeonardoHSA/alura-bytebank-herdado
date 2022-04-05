
public abstract class Funcionario { // abstract indica que a classe � abstrata, ou seja, n�o se pode criar um objeto do tipo Funcionario, s� se consegue criar abijetos filhos desta classe que v�o herdar seus atributos e m�todos.
	
	
	private String nome;
	private String cpf;
	// protected double salario; // Protected significa que o atributo � publico para as classes filhas, que no caso a classe m�e � Funcionario e a classe filha � Gerente
	private double salario;
	
	public abstract double getBonificacao(); // Abstract em um m�todo significa que ele n�o tem um corpo, ou seja, n�o h� implementa��o deste m�todo aaqui na classe Funcionario, mas nas classes filhas de Funcionario precisam que o m�todo getBonificacao seja implementada.  
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
