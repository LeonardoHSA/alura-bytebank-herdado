// Agora a Autenticavel é uma interface, ou seja, não existe nada concreto, nem atributos e nem métodos



// contrato Autenticavel
	// quem assina esse contrato, precisa emplementar
		// metodo setSenha
		// método setAutentica

public abstract interface Autenticavel { // Para se criar um interface se utiliza a palavra reservada interface do java
	
	
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
