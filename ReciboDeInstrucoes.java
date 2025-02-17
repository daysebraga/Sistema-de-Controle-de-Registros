import java.util.Scanner;

public class ReciboDeInstrucoes {
    Gerente gerente;

    Scanner teclado = new Scanner(System.in);

    void enviaInstrucao(){

        System.out.println("Escreva a mensagem desejada: ");
        String msg =  teclado.nextLine();
        System.out.println("digite o ID do funcionario");
        int Id = teclado.nextInt();

        for(int i=0; i<funcionario.length; i++){
            if(funcionario.ID == Id){
                funcionario.Avisos = msg;
                System.out.println(" Mensagem enviada com sucesso!");
            }
            else
                System.out.println(" Usuario nao encontrado");
        }
    }
}
