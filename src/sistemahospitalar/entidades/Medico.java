package sistemahospitalar.entidades;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;

    public Medico( String nome, String cpf, String celular, char sexo, int idade) {
        super(nome, cpf, celular, sexo, idade);
    }

    public Medico(String nome, String cpf, String celular, char sexo, int idade, String crm, String especialidade) {
        super(nome, cpf, celular, sexo, idade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override

    public String toString (){
        return "Nome " +getNome() +
                "Crm " +getCrm() +
                "Especialidade " +getEspecialidade();
    }

}
