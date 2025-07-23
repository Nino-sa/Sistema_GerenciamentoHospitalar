package sistemahospitalar.entidades;

public class Paciente extends Pessoa {

    private int idDeConsulta;

    public Paciente( String nome, String cpf, String celular, char sexo, int idade) {
        super(nome, cpf, celular, sexo, idade);
    }


    public int getIdPaciente() {
        return idDeConsulta;
    }

    public void setIdPaciente(int id) {
        this.idDeConsulta = id;
    }

    @Override
    public String toString() {
        return STR." Nome: \{getNome()} Idade: \{getIdade()} Celular: \{getCelular()} CPF: \{getCpf()} Sexo: \{getSexo()}";

    }


}
