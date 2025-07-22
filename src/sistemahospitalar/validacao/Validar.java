package sistemahospitalar.validacao;

public class Validar {

    public static boolean validarCpf (String cpf){
        return cpf != null && cpf.matches("\\d{11}");

    }

    public static boolean validarCelular(String celular){
        return celular != null && celular.matches("\\d{2}9\\d{8}");
    }


    public static boolean validarEmail (String email){

        return email != null && email.matches ("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$") ;
    }


    public static boolean validaIdade(int idade){
        return idade >= 0 && idade < 105;

    }

    public static boolean validaIdConsulta(int idDeConsulta){
        return idDeConsulta > 0 && idDeConsulta < 200;
    }



}
