
public class Cliente implements Autenticavel { // Para que uma classe implemente os métodos abstratos de uma interface se utiliza a palavra reservada implements, e claro a classe que implementa uma interface é obrigada a implementar seus métodos abstratos
	
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
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
