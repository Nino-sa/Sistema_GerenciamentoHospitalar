package sistemahospitalar.consulta;

import sistemahospitalar.entidades.Medico;
import sistemahospitalar.entidades.Paciente;
import java.time.LocalDate;


public class Consulta {
     Paciente paciente;
     Medico medico;
     LocalDate data;


    //Construtor que válida o estado da classe.
    public  Consulta (Paciente paciente, Medico medico, LocalDate data){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;

    }

    public Consulta(Paciente paciente, Medico medico, LocalDate data, String observacoes) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.observacoes = observacoes;
    }

    @Override
    public String toString(){

        return "Ficha de consulta\n " +
                "Paciente: " + paciente.getNome() + "\n" +
                "CPF: " + paciente.getCpf() + "\n" +
                "Médico: " + medico.getNome() + "\n" +
                "Especialidade: " + medico.getEspecialidade() + "\n" +
                "Data: " + data + "\n" +
                "Observações: " + observacoes;


    }
}
