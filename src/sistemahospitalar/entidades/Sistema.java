package sistemahospitalar.entidades;


import sistemahospitalar.validacao.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    Scanner sc = new Scanner(System.in);
    ArrayList<Paciente> listaPacientes = new ArrayList<>();
    ArrayList<Medico> listaMedicos = new ArrayList<>();


    //Metodo que retorna perguntas para cadastro de paciente.
    public void cadastrarPaciente() {

        System.out.println("Digite seu email: ");
        String email = sc.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite seu número de celular: ");
        String celular = sc.nextLine();
        System.out.println("Digite seu SEXO: Masculino - Feminino - Outro");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();


        try {// try - tentar


            if (!Validar.validaIdade(idade)) {
                throw new IllegalArgumentException("Idade ");
            }

            if (!Validar.validarEmail(email)) {
                throw new IllegalArgumentException("Email  ");
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


        Paciente pacientes = new Paciente(email, nome, cpf, celular, sexo, idade);
        listaPacientes.add(pacientes);

    }


    public void listarPacientes() {
        System.out.println("\nLista de pacientes cadastrados: ");

        if (listaPacientes.isEmpty()) { //Verifica se a lista criada não está vazia
            System.out.println("Nenhum paciente cadastrado");
            return;

        } else {
            for (Paciente p : listaPacientes) {
                System.out.println(p);

            }
        }

    }

    public void apagarPacientes() {

        if (listaPacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado");
            return;

        }

        System.out.println("Pacientes cadastrados: ");
        for (int indice = 0; indice < listaPacientes.size(); indice++) {
            System.out.println("Indice [" + indice + "] " + listaPacientes.get(indice).getNome());

        }

        System.out.println("\nDigite o indice para apagar um elemento específico: ");
        int indice = sc.nextInt();

        if (indice >= 0 && indice < listaPacientes.size()) {
            Paciente removido = listaPacientes.remove(indice);
            System.out.println("Paciente removido: " + removido.getNome());
        } else {
            System.out.println("Índice inválido. ");
        }
    }


    public void cadastrarConsulta (){

        System.out.println("Nome do paciente ");
        String nomePaciente = sc.nextLine();

        System.out.println("CPF do paciente: ");
        String cpf =  sc.nextLine();

        System.out.println("Nome do médico: ");
        String nomeMedico = sc.nextLine();

        System.out.println("Especialidade: ");
        String especialidade = sc.nextLine();

        Consulta novaConsulta = new Consulta();
        listaConsultas.add(novaConsulta);


    }
}