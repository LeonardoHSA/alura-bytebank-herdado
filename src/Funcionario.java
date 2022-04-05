
public abstract class Funcionario { // abstract indica que a classe é abstrata, ou seja, não se pode criar um objeto do tipo Funcionario, só se consegue criar abijetos filhos desta classe que vão herdar seus atributos e métodos.
	
	
	private String nome;
	private String cpf;
	// protected double salario; // Protected significa que o atributo é publico para as classes filhas, que no caso a classe mãe é Funcionario e a classe filha é Gerente
	private double salario;
	
	public abstract double getBonificacao(); // Abstract em um método significa que ele não tem um corpo, ou seja, não há implementação deste método aaqui na classe Funcionario, mas nas classes filhas de Funcionario precisam que o método getBonificacao seja implementada.  
	
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
