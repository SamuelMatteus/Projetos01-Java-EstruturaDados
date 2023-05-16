package br.com.icev.estruturadados.questoes.pilhacaminhoes;
import java.util.Stack;

public class Caminhao {
        private String placa;
        private Stack<Carga> pilhaCargas;


        public Caminhao(String placa) {
                this.placa = placa;
                this.pilhaCargas = new Stack<>();
        }

        public String getPlaca() {
                return placa;
        }

        public void inserirCarga(Carga carga){
                pilhaCargas.push(carga);
        }

        public Carga retirandoCarga() {
                return pilhaCargas.pop();
        }
        public boolean conferirCargaVazia() {
                return !pilhaCargas.isEmpty();
        }
        public int getTotalCargas() {
                return pilhaCargas.size();
        }
}