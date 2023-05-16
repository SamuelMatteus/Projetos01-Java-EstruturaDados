
import java.util.Stack;

public class Desfazer_Acao {
	private Stack<String> acoes;
	private Stack<String> acoesDesfeitas;
	
	public Desfazer_Acao(){
		acoes = new Stack<>();
		acoesDesfeitas = new Stack<>();
	}
	
	public void adicionarAcao(String acao) {
		acoes.push(acao);
		acoesDesfeitas.clear();
		if(acoes.size()>16) {
			acoes.remove(0);
		}
	}
	
	public boolean podeDesfazer() {
		return !acoes.isEmpty();
	}
	
	public void Desfazer() {
		if(podeDesfazer()) {
			String ultimaAcao = acoes.pop();
			acoesDesfeitas.push(ultimaAcao);
		}
	}
	
	public boolean podeRefazer() {
		return !acoesDesfeitas.isEmpty();	
	}
	
	public void Refazer() {
		if(podeRefazer()) {
			String acaoDesfeita = acoesDesfeitas.pop();
			acoes.push(acaoDesfeita);
		}
	}
	
	public Stack<String> getAcoes() {
		return acoes;
	}
	
	public Stack<String> getDesfeitas() {
		return acoesDesfeitas;
	}

}
