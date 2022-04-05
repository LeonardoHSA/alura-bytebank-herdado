// A palavra reservada extends faz com que a classe gerente herde os atributos e os métodos da classe Funcionario, e a classe gerente assina a inteface Autenticavel
// Pode-se falar assim: a classe gerente herda da classe Funcionario e implementa (assina) a interface Autenticavel, pode-se implementar (assinar) várias interfaces 
public class Gerente extends Funcionario implements Autenticavel {
	
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
//	public double getBonificacao() {
//		return super.salario; // A palvara reservada 'super' do java indica que o atributo salário vem da base class, já que no nosso caso a classe Gerente herda todos os atributos e métodos da 							 
//		}					 	 //classe Funcionario, desta maneira fazemos uma reescreita de código.
	
	public double getBonificacao() {
		System.out.println("Executando o método de bonificação do Gerente!!!");
		//return super.getBonificacao() + super.getSalario(); // Desta forma conseguimos reaproveitar os métodoos da classe mãe, assim evitando repetri código, e també acessar os atributos a partir dos métodos da base class Funcionario
		
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
		// boolean autenticou = this.autenticador.autentico.(senha);
		// return true;
		// Também poderia ser escrito desta forma.
	}

}
