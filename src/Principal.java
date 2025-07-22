import sistemahospitalar.entidades.Sistema;

import java.util.Scanner;

public class Principal {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int opcao;


        //H2

        Sistema sistema = new Sistema();


        String menu = """
                
                Escolha uma das opções abaixo:
                
                1 - Cadastrar paciente
                2 - Listar Pacientes
                3 -  Apagar pacientes cadastrados por INDICE
                4 - Sair
                """;


        do {

            System.out.println(menu);
            opcao = sc.nextInt();


            switch (opcao) {

                case 1:
                    System.out.println("Cadastrar paciente:");
                    sistema.cadastrarPaciente();
                    break;

                case 2:
                    System.out.println("Cadastrar médico: ");


                    break;

                case 3:
                    System.out.println("Agendar consultas: ");

                    break;

                case 3:
                    System.out.println("Listar Pacientes: ");
                    sistema.listarPacientes();

                    break;

                case 6:
                    System.out.println("Apagar todos os pacientes cadastrados: ");
                    sistema.apagarPacientes();
                    break;

                case 7:
                    System.out.println("Saindo... Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente");
                    break;

            }
        } while (opcao != 7);
        sc.close();

    }
}