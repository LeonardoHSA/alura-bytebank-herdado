// A palavra reservada extends faz com que a classe gerente herde os atributos e os métodos da classe funcionario
public class EditorVideo extends Funcionario {
	
	
	
	public double getBonificacao() {
		System.out.println("Executando o método de bonificação do Editor de vídeo!!!");
		//return super.getBonificacao() + 100; // Desta forma conseguimos reaproveitar os métodoos da classe mãe, assim evitando repetri código, e també acessar os atributos a partir 											 												//dos métodos da base class Funcionario
		return 150;
	}
}
