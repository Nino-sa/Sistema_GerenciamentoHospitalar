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
                
                1 - Agendar consulta
                2 - Listar consulta
                3 - Apagar consulta
                4 - Sair
                
                
                """;


        do {

            System.out.println(menu);
            opcao = sc.nextInt();


            switch (opcao) {

                case 1:
                    System.out.println("Agendar consulta:");
                    sistema.criarConsulta();
                    break;

                case 2:
                    System.out.println("Listar consultas: ");
                    sistema.listarConsulta();
                break;

                case 3:
                    System.out.println("Apagar consulta cadastrada: ");
                    sistema.apagarConsulta();
                    break;

                case 4:
                    System.out.println("Saindo... Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente");
                    break;

            }
        } while (opcao != 4);
        sc.close();

    }
}