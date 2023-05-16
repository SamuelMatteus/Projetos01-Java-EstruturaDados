package estruturadados.questoes.manipulando

public class Executar {

	public static void main(String[]args){
 /*       
		DB_Notas historico = new DB_Notas();

        historico.adicionaNota(6.5f);
        historico.adicionaNota(9.0f);
        historico.adicionaNota(8.75f);

        historico.exibirNotas();

        historico.removerUltima();

        historico.limpaHistorico();
*/
		Desfazer_Acao pilha = new Desfazer_Acao();
		
		pilha.adicionarAcao("Acao 1");
		pilha.adicionarAcao("Acao 2");
		pilha.adicionarAcao("Acao 3");
		pilha.adicionarAcao("Acao 4");
		
		
		System.out.println("Acoes realizadas: ");
		System.out.println(pilha.getAcoes());
		
		pilha.Desfazer();
		pilha.adicionarAcao("Acao 5");
		pilha.adicionarAcao("Acao 6");
		pilha.Desfazer();
		
		
		System.out.println("Acoes após desfazer a ultima e adicionar uma nova: ");
		System.out.println(pilha.getAcoes());
		System.out.println("Acoes desfeitas: ");
		System.out.println(pilha.getDesfeitas());

	}
	
}
