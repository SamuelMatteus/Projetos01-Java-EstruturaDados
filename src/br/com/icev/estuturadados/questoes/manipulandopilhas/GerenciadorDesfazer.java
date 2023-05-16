package br.com.icev.estuturadados.questoes.manipulandopilhas;
import java.util.Stack;
public class GerenciadorDesfazer {
    private Stack<Acao> DesfazendoPilha;

    public GerenciadorDesfazer() {
        DesfazendoPilha = new Stack<>();
    }

    public void executarAcao(Acao acao) {
        acao.executar();
        DesfazendoPilha.push(acao);
    }

    public void desfazerUltimaAcao() {
        if (!DesfazendoPilha.isEmpty()) {
            Acao ultimaAcao = DesfazendoPilha.pop();
            ultimaAcao.desfazer();
        } else {
            System.out.println("Nenhuma ação para desfazer.");
        }
    }
}

class Acao {
    private String nome;

    public Acao(String nome) {
        this.nome = nome;
    }

    public void executar() {
        System.out.println("Executando ação: " + nome);
    }

    public void desfazer() {
        System.out.println("Desfazendo ação: " + nome);
    }
}

