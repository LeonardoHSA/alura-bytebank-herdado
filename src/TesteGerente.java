
public class TesteGerente {
	public static void main(String[] args) {
		
		Gerente g2 = new Gerente();
		g2.setNome("Leonardo");
		g2.setCpf("456.789.258-12");
		g2.setSalario(6000.00);
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("123.456.789-01");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
//		
//		g1.setSenha(666);
//		boolean autenticou = g1.autentica(666);
		
//		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		System.out.println(g2.getBonificacao());
		
		
	}
}
