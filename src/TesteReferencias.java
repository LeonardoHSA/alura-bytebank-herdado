
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		// Desta forma estamos criando uma vari�vel do tipo mais gen�rico poss�vel s� que usando o construtor da classe Gerente j� que a classe Gerente herda da Calsse funcionario
		// O contr�rio n�o funcionaria 
		// Isso se chama polimorfismo 
		//Funcionario g1 = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Leo");
		g1.setSalario(5000.0);
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		// A invoca��o deste m�todo n�o funciona pelo fato de a classe Funcionario n�o possuir esse m�todo, j� que g1 � do tipo funcionario 
		// g1.autentica();
		
		System.out.println(g1.getNome());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		
		System.out.println(controle.getSoma());
		
		
		
	}
}
