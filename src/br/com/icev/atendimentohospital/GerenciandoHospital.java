package br.com.icev.atendimentohospital;

public class GerenciandoHospital {
    public static void main(String[] args) {
        GestaoPacientes.GestaoHospital gestaoHospital = new GestaoPacientes.GestaoHospital();

        gestaoHospital.adicionarPaciente("Samuel", "44455566699", 3);
        gestaoHospital.adicionarPaciente("Maria", "11122233300", 2);
        gestaoHospital.adicionarPaciente("Pedro", "77744488866", 1);
        gestaoHospital.adicionarPaciente("Ana", "0123456789", 0);

        System.out.println("Número de pacientes na fila: " + gestaoHospital.getNumeroPacientesNaFila());

        GestaoPacientes.GestaoPacientes pacienteAtendido = gestaoHospital.atenderProximoPaciente();
        if (pacienteAtendido != null) {
            System.out.println("Paciente atendido: " + pacienteAtendido);
        } else {
            System.out.println("Não há pacientes na fila.");
        }
    }
}
