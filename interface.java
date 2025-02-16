import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class interface {

    public static void main(String[] args) {
        
        System.out.println("bem vindo...");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - login\n
                            2 - cadastrar\n");
        String opcao = scanner.nextLine();

        switch (opcao) {
            case 1:
                int login1 = login();

                    if(login1 > 2){
                       menu_funcionario();
                    } 
                    if else(login1 <= 2)
                    {
                        menu_gerente();
                    }
            case 2:
                System.out.println("Cadastrar");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
int login(){
     System.out.println(" login: \n");
                System.out.println("Digite seu codigo de acesso: \n");
                String login = scanner.nextLine();
                System.out.println("Digete sua senha: \n");
                String senha = scanner.nextLine();
                                                    //verificar se o login e senha estão corretos com a class de seguranca
                Autenticar(login, senha);
                return login;
    
    }
void menu_funcionario(){
    System.out.println("1 - justificativas \n
                        2 - Ferias e abono \n  
                        3 - Pagamento \n");
    String opcao = scanner.nextLine();
                                            // chamada das funcoes de funcionario
    switch (opcao){

        case 1:
            soliticaMsg();
            break;
        case 2:
            AbonoFerias(Id);
            break;
        case 3:
            calculaPagamento();
            break;
        }
    }
void menu_gerente(){
    System.out.println("1 - enviar intrucao \n
                        2 - lista de funcionarios \n
                        3 - remover funcionario \n
                        4 - resumo do funcionario\n
                        5 - resumo de todos funcionarios\n");
    String opcao = scanner.nextLine();
                                            // chamada das funcoes de gerente    
    switch (opcao){
        case 1: 
            enviaInstrucao();
            break;
        case 2:
            listarFuncionarios();
            break;
        case 3:
            removerFuncionario():
            break;
        case 4:
            resumoFuncionario();
            break;
        case 5:
            resumoFuncionarios();
            break;
        }
    }    
}
