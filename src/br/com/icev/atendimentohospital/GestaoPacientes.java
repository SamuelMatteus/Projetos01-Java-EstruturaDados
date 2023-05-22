package br.com.icev.atendimentohospital;
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.List;
import java.util.Queue;
public class GestaoPacientes {
    class GestaoPacientes {
        private String nome;
        private String cpf;
        private int prioridade;

        public GestaoPacientes(String nome, String cpf, int prioridade) {
            this.nome = nome;
            this.cpf = cpf;
            this.prioridade = prioridade;
        }

        public int getPrioridade() {
            return prioridade;
        }

        @Override
        public String toString() {
            return "Paciente [nome=" + nome + ", cpf=" + cpf + ", prioridade=" + prioridade + "]";
        }
    }

    class GestaoHospital {
        private Queue<GestaoPacientes> filaSevero;
        private Queue<GestaoPacientes> filaModerado;
        private Queue<GestaoPacientes> filaLeve;
        private Queue<GestaoPacientes> filaNormal;

        public GestaoHospital() {
            filaSevero = new LinkedList<>();
            filaModerado = new LinkedList<>();
            filaLeve = new LinkedList<>();
            filaNormal = new LinkedList<>();
        }

        public void adicionarPaciente(String nome, String cpf, int prioridade) {
            GestaoPacientes paciente = new GestaoPacientes(nome, cpf, prioridade);

            if (prioridade == 3) {
                filaSevero.offer(paciente);
            } else if (prioridade == 2) {
                filaModerado.offer(paciente);
            } else if (prioridade == 1) {
                filaLeve.offer(paciente);
            } else {
                filaNormal.offer(paciente);
            }
        }

        public GestaoPacientes atenderProximoPaciente() {
            if (!filaSevero.isEmpty()) {
                return filaSevero.poll();
            } else if (!filaModerado.isEmpty()) {
                return filaModerado.poll();
            } else if (!filaLeve.isEmpty()) {
                return filaLeve.poll();
            } else if (!filaNormal.isEmpty()) {
                return filaNormal.poll();
            }

            return null;
        }

        public int getNumeroPacientesNaFila() {
            return filaSevero.size() + filaModerado.size() + filaLeve.size() + filaNormal.size();
        }
    }

}

