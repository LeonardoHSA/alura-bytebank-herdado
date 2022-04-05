
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) { // Desta maneira não se precisa mais mexer neste código para cada tipo de funcionario que entrar na empresa, e memso assim quando um determinado tipo 
		double boni = f.getBonificacao(); // 	de funcionario invocar este método e tipo de fincionario irá usar se método de bonificação, seu claculo específico
		this.soma = this.soma + boni;     //
	}
	
	public double getSoma() {
		return soma;
	}
}
