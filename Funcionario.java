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
    private int Abono;
    private int Ferias;

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
        Abono = 0;
        Ferias = 0;
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

    //Em dias
    public int getTempoServico(){
        return this.TempoServico;
    }

    public String getAviso(int i){
        return this.Avisos[i];
    }

    public void addAviso(int i, String Aviso){
        this.Avisos[i] = Aviso;
    }

    public String toString(){
        return "ID: "+this.ID+" Funcionário "+this.nome+". Cargo: "+this.Cargo+", com carga horaria de "+this.cargaHorariaSemanal+
                " horas semanais. Tempo de servico: "+this.TempoServico+
                "Tempo Disponivel de Abono: "+this.Abono+", Tempo Disponivel de Ferias: "+this.Ferias;
    }

}
