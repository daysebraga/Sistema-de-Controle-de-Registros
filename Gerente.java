import java.util.Scanner;

public class Gerente {
    private String nome;
    private String genero;
    private String DatadeNascimento;
    private int CargaHorariaSemanal;
    private int ID;
    private String senha;
    private int TempoServico;
    private Avisos[] Avisos = new Avisos[100];


    //iniciando vazio
    public Gerente(){
        nome = "";
        genero = "";
        DatadeNascimento = "";
        CargaHorariaSemanal = 0;
        ID = 0;
        senha = "";
        TempoServico = 0;
    }

    public Gerente(String nome, String genero, String DatadeNascimento, int CargaHorariaSemanal,
                   int ID, String senha, int TempoServico){
        this.nome = nome;
        this.genero = genero;
        this.DatadeNascimento = DatadeNascimento;
        this.CargaHorariaSemanal = CargaHorariaSemanal;
        this.ID = ID;
        this.senha = senha;
        this.TempoServico = TempoServico;
    }

    public void setAviso(String nome, int ID){
        Scanner teclado = new Scanner(System.in);
        for (int j = 0; j < 100; j++) {
            if (Avisos[j] == null) {
                teclado = new Scanner(System.in);
                System.out.println("Escreva a justificativa:");
                Avisos[j] = new Avisos("ID: "+ID+" Nome: "+nome+": "+teclado.nextLine());
                System.out.println("Justificativa enviada com sucesso");
                return;
            }
        }
    }

    public int getID(){
        return this.ID;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSenha(){
        return this.senha;
    }

    //Em dias
    public int getTempoServico(){
        return this.TempoServico;
    }

    public void getAviso(int i){
        if(Avisos[i] != null)
            System.out.println(this.Avisos[i].getAviso());
    }
}
