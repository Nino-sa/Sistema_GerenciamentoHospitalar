package sistemahospitalar.entidades;
import java.time.LocalDate;

public class Pessoa {


    private String email;
    private String nome;
    private String cpf;
    private String celular;
    private char sexo;
    private int idade;


    public Pessoa(String email, String nome, String cpf, String celular, char sexo, int idade) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }




}
