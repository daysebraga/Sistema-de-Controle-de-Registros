public class Funcionario {
    private String nome;
    private String genero;
    private int DatadeNascimento;
    private String Cargo;
    private int cargaHorariaSemanal;
    private int ID;
    private String senha;
    private int TempoServico;

    //Inicializando
    public Funcionario() {
        nome = "";
        genero = "";
        DatadeNascimento = 0;
        Cargo = "";
        cargaHorariaSemanal = 0;
        ID = 0;
        senha = "";
        TempoServico = 0;
    }

    public Funcionario(String nome, String genero, int DatadeNascimento,
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

}
