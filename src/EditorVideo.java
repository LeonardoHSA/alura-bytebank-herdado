// A palavra reservada extends faz com que a classe gerente herde os atributos e os m�todos da classe funcionario
public class EditorVideo extends Funcionario {
	
	
	
	public double getBonificacao() {
		System.out.println("Executando o m�todo de bonifica��o do Editor de v�deo!!!");
		//return super.getBonificacao() + 100; // Desta forma conseguimos reaproveitar os m�todoos da classe m�e, assim evitando repetri c�digo, e tamb� acessar os atributos a partir 											 												//dos m�todos da base class Funcionario
		return 150;
	}
}
