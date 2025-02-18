import java.util.Scanner;

public class ReciboDeInstrucoes {

    Scanner teclado = new Scanner(System.in);

    public String enviaInstrucao(){

        System.out.println("Escreva a mensagem desejada: ");

        return teclado.nextLine();
    }
}
