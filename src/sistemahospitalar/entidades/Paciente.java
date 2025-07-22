package sistemahospitalar.entidades;

public class Paciente extends Pessoa {

    private int idDeConsulta;

    public Paciente(String email, String nome, String cpf, String celular, char sexo, int idade) {
        super(email, nome, cpf, celular, sexo, idade);
    }


    public int getIdPaciente() {
        return idDeConsulta;
    }

    public void setIdPaciente(int id) {
        this.idDeConsulta = id;
    }

    public String toString() {
        return  " Nome: " + getNome() +
                " Idade: " + getIdade() +
                " Email: " + getEmail() +
                " Celular: " + getCelular() +
                " CPF: " + getCpf() +
                " Sexo: " + getSexo();

    }


}
