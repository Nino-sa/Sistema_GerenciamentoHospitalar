package sistemahospitalar.consulta;

import sistemahospitalar.entidades.Medico;
import sistemahospitalar.entidades.Paciente;

import java.time.LocalDate;


public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDate data;
    private String observacoes;


    public Consulta() {

    }


    //Construtor que válida o estado da classe.
    public Consulta(Paciente paciente, Medico medico, LocalDate data) {
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
    public String toString() {

        return STR."""
Ficha de consulta
 Paciente: \{paciente.getNome()}
CPF: \{paciente.getCpf()}
Médico: \{medico.getNome()}
Especialidade: \{medico.getEspecialidade()}
Data: \{data}
Observações: \{observacoes}""";

    }
}
