package br.com.icev.estruturadados.questoes.pilhacaminhoes;

public class Principal {
    public static void main(String[] args) {
        Logistica empresa = new Logistica();

        Caminhao caminhao1 = new Caminhao("ABC123");
        caminhao1.inserirCarga(new Carga("Carga 1", 2));
        caminhao1.inserirCarga(new Carga("Carga 2", 1));
        caminhao1.inserirCarga(new Carga("Carga 3", 3));
        empresa.inserirCaminhao(caminhao1);

        Caminhao caminhao2 = new Caminhao("DEF456");
        caminhao2.inserirCarga(new Carga("Carga 4", 1));
        caminhao2.inserirCarga(new Carga("Carga 5", 2));
    }
}
