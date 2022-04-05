// A palavra reservada extends faz com que a classe gerente herde os atributos e os m�todos da classe Funcionario, e a classe gerente assina a inteface Autenticavel
// Pode-se falar assim: a classe gerente herda da classe Funcionario e implementa (assina) a interface Autenticavel, pode-se implementar (assinar) v�rias interfaces 
public class Gerente extends Funcionario implements Autenticavel {
	
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
//	public double getBonificacao() {
//		return super.salario; // A palvara reservada 'super' do java indica que o atributo sal�rio vem da base class, j� que no nosso caso a classe Gerente herda todos os atributos e m�todos da 							 
//		}					 	 //classe Funcionario, desta maneira fazemos uma reescreita de c�digo.
	
	public double getBonificacao() {
		System.out.println("Executando o m�todo de bonifica��o do Gerente!!!");
		//return super.getBonificacao() + super.getSalario(); // Desta forma conseguimos reaproveitar os m�todoos da classe m�e, assim evitando repetri c�digo, e tamb� acessar os atributos a partir dos m�todos da base class Funcionario
		
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
		// Tamb�m poderia ser escrito desta forma.
	}

}
