package br.com.icev.estruturadados.questoes.pilhacaminhoes;
import java.util.Stack;

public class Logistica {
    private Stack<Caminhao> frota;

    public Logistica() {
        frota = new Stack<>();

    }
    public void inserirCaminhao (Caminhao caminhao){
        frota.push(caminhao);
    }
    public Caminhao retirarCaminhao(){
        return frota.pop();
    }
    public boolean garagemVazia(){
        return !frota.isEmpty();
    }
    public int caminhoesNaGaragem() {
        return frota.size();
    }

    public void entregas() {
        Caminhao caminhao = retirarCaminhao();
        if (caminhao.conferirCargaVazia()){
            System.out.println("Veículo / Placa: " + caminhao.getPlaca());
            System.out.println("Quantidade de Cargas: " + caminhao.getTotalCargas());
            while (caminhao.conferirCargaVazia()) {
                Carga carga = caminhao.retirandoCarga();
                System.out.println("Carga: " + carga.getDescricaoCarga() + "Criticidade Nível " + carga.getNivelCriticidade());
            }
            System.out.println();
        }
    }
}
