
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) { // Desta maneira n�o se precisa mais mexer neste c�digo para cada tipo de funcionario que entrar na empresa, e memso assim quando um determinado tipo 
		double boni = f.getBonificacao(); // 	de funcionario invocar este m�todo e tipo de fincionario ir� usar se m�todo de bonifica��o, seu claculo espec�fico
		this.soma = this.soma + boni;     //
	}
	
	public double getSoma() {
		return soma;
	}
}
