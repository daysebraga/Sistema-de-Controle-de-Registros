public class Funcionario {
    private String nome;
    private String genero;
    private String DatadeNascimento;
    private String Cargo;
    private int cargaHorariaSemanal;
    private int ID;
    private String senha;
    private int TempoServico;
    private String[] Avisos;

    //Inicializando
    public Funcionario() {
        nome = "";
        genero = "";
        DatadeNascimento = "";
        Cargo = "";
        cargaHorariaSemanal = 0;
        ID = 0;
        senha = "";
        TempoServico = 0;
        Avisos = new String[0];
    }

    public Funcionario(String nome, String genero, String DatadeNascimento,
                       String Cargo, int cargaHorariaSemanal, int ID, String senha, int TempoServico){
        this.nome = nome;
        this.genero = genero;
        this.DatadeNascimento = DatadeNascimento;
        this.Cargo = Cargo;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.ID = ID;
        this.senha = senha;
        this.TempoServico = TempoServico;
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

    public int getTempoServico(){
        return this.TempoServico;
    }

    public String toString(){
        return this.ID+" Funcionário "+this.nome+", "+this.Cargo+", Tempo de Serviço: "+this.TempoServico;
    }

}
