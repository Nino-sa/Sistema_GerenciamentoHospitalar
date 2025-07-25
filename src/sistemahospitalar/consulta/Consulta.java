package sistemahospitalar.consulta;

import sistemahospitalar.entidades.Medico;
import sistemahospitalar.entidades.Paciente;



public class Consulta {
    private Paciente paciente;
    private Medico medico;



    //Construtor que válida o estado da classe.
    public Consulta(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;

    }

    @Override
    public String toString() {
        return "Consulta{" +
                "paciente=" + paciente +
                ", medico=" + medico +
                '}';
    }
}
