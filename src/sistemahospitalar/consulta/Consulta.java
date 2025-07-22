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

}
