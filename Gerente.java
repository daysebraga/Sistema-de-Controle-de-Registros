public class Gerente {
    private String nome;
    private String genero;
    private int DatadeNascimento;
    private int CargaHorariaSemanal;
    private int ID;
    private String senha;
    private int TempoServico;

    //iniciando vazio
    public Gerente(){
        nome = "";
        genero = "";
        DatadeNascimento = 0;
        CargaHorariaSemanal = 0;
        ID = 0;
        senha = "";
        TempoServico = 0;
    }

    public Gerente(String nome, String genero, int DatadeNascimento, int CargaHorariaSemanal,
                   int ID, String senha, int TempoServico){
        this.nome = nome;
        this.genero = genero;
        this.DatadeNascimento = DatadeNascimento;
        this.CargaHorariaSemanal = CargaHorariaSemanal;
        this.ID = ID;
        this.senha = senha;
        this.TempoServico = TempoServico;
    }
}
