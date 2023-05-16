package br.com.icev.pilhainversa;

import java.util.Stack;

public class InversaPilha {
    private Stack<String> notas;

    public InversaPilha () {
        notas = new Stack<>();
    }

    public void inserirNota(String nota) {
        notas.push(nota);
    }

    public void exibirNotasAoInverso(){
        Stack<String> notasInvertidas = new Stack<>();

        for (String nota : notas) {
            notasInvertidas.push(nota);
        }
        while (!notasInvertidas.empty()) {
            String nota = notasInvertidas.pop();
            System.out.println(nota);
        }
    }

}

