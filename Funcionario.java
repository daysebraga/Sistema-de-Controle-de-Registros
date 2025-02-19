import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String genero;
    private String DatadeNascimento;
    private String DatadeIngresso;
    private String Cargo;
    private int cargaHorariaSemanal;
    private int ID;
    private String senha;
    private int TempoServico;
    private Avisos[] Avisos = new Avisos[100];
    private int tamAvisos;
    private int Abono;
    private int Ferias;
    //Tem que passar o salario em um valor a ser multiplicado, não mensal.
    private int Salario;

    //Inicializando
    public Funcionario() {
        nome = "";
        genero = "";
        DatadeNascimento = "";
        DatadeIngresso = "";
        Cargo = "";
        cargaHorariaSemanal = 0;
        ID = 0;
        senha = "";
        TempoServico = 0;
        tamAvisos = 0;
        Abono = 0;
        Ferias = 0;
        Salario = 0;
    }

    public Funcionario(String nome, String genero, String DatadeNascimento,
                       String Cargo, int cargaHorariaSemanal, int ID, String senha, int TempoServico, String DatadeIngresso){
        this.nome = nome;
        this.genero = genero;
        this.DatadeNascimento = DatadeNascimento;
        this.Cargo = Cargo;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.ID = ID;
        this.senha = senha;
        this.TempoServico = TempoServico;
        this.DatadeIngresso = DatadeIngresso;
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

    public String getCargo(){
        return this.Cargo;
    }

    public int getCargaHoraria(){
        return this.cargaHorariaSemanal;
    }

    public String getDatadeNascimento(){
        return this.DatadeNascimento;
    }

    public String getDatadeIngresso(){
        return this.DatadeIngresso;
    }

    public int getNumAlertas(){
        int tamAvisos2 = 0;
        for(int i = 0; i < this.Avisos.length; i++){
            if(this.Avisos[i] != null){tamAvisos2++;}
        }

        return tamAvisos2;
    }

    public int getSalario(){
        return this.Salario;
    }

    public void setAviso(int i){
        Scanner teclado = new Scanner(System.in);
        for (int j = 0; j < i; j++) {
            if (Avisos[j] == null) {
                teclado = new Scanner(System.in);
                System.out.println("Escreva o aviso:");
                Avisos[j] = new Avisos(teclado.nextLine());
                System.out.println("Aviso enviado com sucesso");
                return;
            }
        }
    }

    public void setSalario(int n){ this.Salario = n;}

    public String toString(){
        for(int i = 0; i < this.Avisos.length; i++){
            if(this.Avisos[i] != null){tamAvisos++;}
        }

        return "ID: "+this.ID+" Funcionário "+this.nome+". Cargo: "+this.Cargo+", com carga horaria de "+this.cargaHorariaSemanal+
                " horas semanais. Tempo de servico: "+this.TempoServico+
                ".\nTempo Disponivel de Abono: "+this.Abono+", Tempo Disponivel de Ferias: "+this.Ferias+". Alertas: "+this.tamAvisos;
    }

}
