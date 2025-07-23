package sistemahospitalar.entidades;


import sistemahospitalar.consulta.Consulta;
import sistemahospitalar.validacao.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    Scanner sc = new Scanner(System.in);
    ArrayList<Consulta> listaConsultas = new ArrayList<>();

    //Metodo que retorna perguntas para cadastro de paciente.

    public void criarConsulta() {


        System.out.println("Nome do paciente ");
        String nomePaciente = sc.nextLine();

        System.out.println("CPF do paciente: ");
        String cpf = sc.nextLine();

        System.out.println("Celular do paciente: ");
        String celular = sc.nextLine();

        System.out.println("Nome do médico: ");
        String nomeMedico = sc.nextLine();

        System.out.println("Especialidade: ");
        String especialidade = sc.nextLine();

        System.out.println("Digite seu SEXO: Masculino - Feminino - Outro");
        char sexo = sc.nextLine().charAt(0);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        sc.nextLine();

        Consulta novasConsultas = new Consulta();
        listaConsultas.add(novasConsultas);



        try {// try - tentar


            if (!Validar.validaIdade(idade)) {
                throw new IllegalArgumentException("Idade ");
            }

            if (!Validar.validarCpf(cpf)) {
                throw new IllegalArgumentException("CPF  ");
            }


            if (!Validar.validarCelular(celular)) {
                throw new IllegalArgumentException("Celular  ");
            }


        } catch (IllegalArgumentException erro) { // catch -> capturar
            System.out.println("Ocorreu um erro ao validar: " + erro.getMessage());

        } finally {
            System.out.println("Encerrando validação.");
        }
        System.out.println("Cadastro concluído com sucesso. ");


    }


    public void listarConsulta() {
        System.out.println("\nLista de consultas criadas: ");
        System.out.println();

        if (listaConsultas.isEmpty()) { //Verifica se a lista criada não está vazia
            System.out.println("Nenhum paciente cadastrado");
            return;

        } else {
            for (Consulta c : listaConsultas) {
                System.out.println(c);

            }
        }

    }

    public void apagarConsulta() {

        if (listaConsultas.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado");
            return;

        }

        System.out.println("Consulta cadastrados: ");
        for (int indice = 0; indice < listaConsultas.size(); indice++) {
            System.out.println("Indice [" + indice + "] " + listaConsultas.get(indice));

        }

        System.out.println("\nDigite o indice para apagar a consulta em específico: ");
        int indice = sc.nextInt();

        if (indice >= 0 && indice < listaConsultas.size()) {
            Consulta removido = listaConsultas.remove(indice);
            System.out.println("Consulta excluída: " + removido);

        } else {
            System.out.println("Índice inválido. ");
        }
    }
}