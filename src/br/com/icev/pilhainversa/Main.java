package br.com.icev.pilhainversa;

public class Main {
    public static void main(String[] args) {
        InversaPilha app = new InversaPilha();
        app.inserirNota("Nota 1");
        app.inserirNota("Nota 2");
        app.inserirNota("Nota 3");

        app.exibirNotasAoInverso();

    }
}
