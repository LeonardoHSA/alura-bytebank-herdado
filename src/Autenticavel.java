// Agora a Autenticavel � uma interface, ou seja, n�o existe nada concreto, nem atributos e nem m�todos



// contrato Autenticavel
	// quem assina esse contrato, precisa emplementar
		// metodo setSenha
		// m�todo setAutentica

public abstract interface Autenticavel { // Para se criar um interface se utiliza a palavra reservada interface do java
	
	
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
