import java.util.Scanner;

public class Main {
    public static Seguranca seguranca = new Seguranca();
    public static ReciboDeInstrucoes instrucoes = new ReciboDeInstrucoes();
    public static FeriaseAbono feriaseAbono = new FeriaseAbono();
    public static Justificativas justificativas = new Justificativas();
    public static Pagamento pagamento = new Pagamento();


    public static void menu_funcionario(int id) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Justificativas\n" +
                    "2 - Ferias e abono\n" +
                    "3 - Pagamento\n"+
                    "4 - Seu resumo\n"+
                    "5 - Ver avisos\n"+
                    "6 - Sair\n");
            opcao = scanner.nextInt();
            // chamada das funcoes de funcionario
            switch (opcao) {

                case 1:
                    System.out.println(" insira seu ID");
                    int id = scanner.nextInt();
                    justificativas.soliticaMsg(id);
                    break;
                case 2:
                    System.out.println("O que voce quer ver?\n" +
                            "1 - Abono\n" +
                            "2 - Ferias\n" +
                            "3 - Voltar\n");
                    int Fopcao = scanner.nextInt();

                    switch (Fopcao) {
                        case 1:
                            feriaseAbono.calculoAbono(seguranca.get_funcionario(id).getTempoServico(), id);

                        case 2:
                            feriaseAbono.calculoFerias(seguranca.get_funcionario(id).getTempoServico(), id);

                        case 3:
                    }
                    break;
                case 3:
                    pagamento.calculaPagamento();
                    break;
                case 4:
                    seguranca.resumoFuncionario(id);
                    break;
                case 5:
                    seguranca.getAvisos(id);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(opcao != 6);
    }

    public static void menu_gerente() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Enviar instrucao\n" +
                    "3 - Lista de funcionarios\n" +
                    "4 - Remover funcionario\n" +
                    "5 - Resumo do funcionario\n" +
                    "6 - Resumo de todos funcionarios\n" +
                    "7 - Definir salário de funcionário\n"+
                    "8 - Sair\n");
            opcao = scanner.nextInt();
            // chamada das funcoes de gerente
            int id;
            switch (opcao) {
                case 1:
                    System.out.println("Insira o ID do funcionario");
                    id = scanner.nextInt();
                    seguranca.emitirAviso(id);
                    break;
                case 2:
                    seguranca.listarFuncionarios();
                    break;
                case 3:
                    System.out.println("Insira o ID do funcionario");
                    id = scanner.nextInt();
                    seguranca.removerFuncionario(id);
                    break;
                case 4:
                    System.out.println("Insira o ID do funcionario");
                    id = scanner.nextInt();
                    seguranca.resumoFuncionario(id);
                    break;
                case 5:
                    seguranca.resumoFuncionarios();
                    break;
                case 6:
                    //O salario vai ser apenas o valor base a ser multiplicado
                    //não é o valor mensal.
                    System.out.println("Insira o ID do funcionario");
                    id = scanner.nextInt();
                    seguranca.definirSalario(id);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(opcao != 7);
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("bem vindo...");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Login\n2 - Cadastrar\n3 - Sair\n");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("login: \n");
                    System.out.println("Digite seu codigo de acesso: \n");
                    int login = scanner.nextInt();
                    System.out.println("Digite sua senha: \n");
                    scanner = new Scanner(System.in);
                    String senha = scanner.nextLine();

                    //verficar se o login e senha estão corretos com a class de seguranca
                    int login1 = seguranca.Autenticar(login, senha);

                    if (login1 == 1) {
                        menu_funcionario(login);
                    } else if (login1 == 2) {
                        menu_gerente();
                    } else{
                        System.out.println("Usuario nao encontrado!");
                    }

                    break;
                case 2:
                    int opcao2;
                    do {
                        System.out.println("Cadastro de: " +
                                "1 - Funcionario \n" +
                                "2 - Gerente \n" +
                                "3 - Voltar \n");
                        opcao2 = scanner.nextInt();
                        switch (opcao2) {
                            case 1:
                                seguranca.cadastroFuncionario();
                                break;

                            case 2:
                                //realiza o cadastro de Gerente apenas se não houver gerentes cadastrados.
                                if (seguranca.getGerente().getID() == 0) {
                                    seguranca.cadastroGerente();
                                } else {
                                    System.out.println("Ja tem um gerente cadastrado");
                                }
                                break;
                            case 3:
                                System.out.println("Voltando...");
                                break;

                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    } while (opcao2 != 3);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }while (opcao != 3);
    }
}
