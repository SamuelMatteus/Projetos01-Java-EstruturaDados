package br.com.icev.estuturadados.questoes.manipulandopilhas;
import java.util.Stack;
public class GerenciadorDesfazer {
    private Stack<Acao> pilhaDesfazer;

    public GerenciadorDesfazer() {
        pilhaDesfazer = new Stack<>();
    }

    public void executarAcao(Acao acao) {
        acao.executar();
        pilhaDesfazer.push(acao);
    }

    public void desfazerUltimaAcao() {
        if (!pilhaDesfazer.isEmpty()) {
            Acao ultimaAcao = pilhaDesfazer.pop();
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
        // Lógica para executar a ação
    }

    public void desfazer() {
        System.out.println("Desfazendo ação: " + nome);
        // Lógica para desfazer a ação
    }
}

