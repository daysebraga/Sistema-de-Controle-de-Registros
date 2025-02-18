import java.util.Scanner;
import java.time.LocalDate;

public class Seguranca {
    Funcionario[] funcionario = new Funcionario[100];
    Gerente gerente = new Gerente();


    public Seguranca(){
        funcionario[0] = new Funcionario("Douglas", "Homem","2000-10-04", "RH",
                30, 2345048, "douglas22", 33, "2022-03-11");
    }

    Scanner teclado = new Scanner(System.in);



    //funcao para cadastrar os funcionarios
    public String cadastroFuncionario(){
        String nome;
        String genero;
        String dataDeNascimento;
        String cargo;
        int cargaHorariaSemanal;
        int id;
        String senha;
        int tempoServico = 0;

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        teclado = new Scanner(System.in);
        System.out.println("Digite seu ID:");
        id = teclado.nextInt();

        boolean salv = false;

        for(int i = 0; i<funcionario.length; i++){
            if((funcionario[i] != null) && funcionario[i].getNome().equals(nome) && (funcionario[i].getID() == id)){
                System.out.println("Este funcionario ja esta cadastrado.");
                salv = true;
                break;
            }
        }
        if(!salv){
            for(int i = 0; i<funcionario.length; i++){
                if(funcionario[i] == null){
                    teclado = new Scanner(System.in);
                    System.out.println("Digite seu genero:");
                    genero = teclado.nextLine();

                    teclado = new Scanner(System.in);
                    System.out.println("Digite sua data de nascimento:");
                    dataDeNascimento = teclado.nextLine();

                    teclado = new Scanner(System.in);
                    System.out.println("Digite seu cargo:");
                    cargo = teclado.nextLine();

                    teclado = new Scanner(System.in);
                    System.out.println("Digite sua carga horaria semanal:");
                    cargaHorariaSemanal = teclado.nextInt();

                    teclado = new Scanner(System.in);
                    System.out.println("Digite sua senha:");
                    senha = teclado.nextLine();

                    String Data = LocalDate.now().toString();


                    funcionario[i] = new Funcionario(nome, genero, dataDeNascimento, cargo, cargaHorariaSemanal,
                            id, senha, tempoServico, Data);

                    break;
                }
            }

        }else{
            return "Cadastro não realizado";
        }

        return "Cadastro realizado";
    }

    //Funcao para cadastrar o gerente, só é possivel ter um gerente.
    public String cadastroGerente(){
        if(gerente.getID() == 0) {
            String nome;
            String genero;
            String dataDeNascimento;
            int cargaHorariaSemanal;
            int id;
            String senha;
            int tempoServico = 0;

            System.out.println("Digite seu nome: ");
            nome = teclado.nextLine();

            teclado = new Scanner(System.in);
            System.out.println("Digite seu ID:");
            id = teclado.nextInt();

            teclado = new Scanner(System.in);
            System.out.println("Digite seu genero:");
            genero = teclado.nextLine();

            teclado = new Scanner(System.in);
            System.out.println("Digite sua data de nascimento:");
            dataDeNascimento = teclado.nextLine();

            teclado = new Scanner(System.in);
            System.out.println("Digite sua carga horaria semanal:");
            cargaHorariaSemanal = teclado.nextInt();

            teclado = new Scanner(System.in);
            System.out.println("Digite sua senha:");
            senha = teclado.nextLine();

            gerente = new Gerente(nome, genero, dataDeNascimento, cargaHorariaSemanal,
                    id, senha, tempoServico);

            return "Cadastro realizado";
        }else{
            return "Gerente ja esta cadastrado.";
        }
    }

    String calculoTempoServico(){
        return "Calculo Tempo de Servico";
    }

    //Funcao para realizar o LOGIN no sistema
    public int Autenticar(int id, String senha){

        for(int i = 0; i<funcionario.length; i++){
            if(funcionario[i] != null && funcionario[i].getID() == id && funcionario[i].getSenha().equals(senha)){
                System.out.println("Autenticacao realizada com sucesso.");
                return 1;
            }
            else{
                if(gerente != null && gerente.getID() == id && gerente.getSenha().equals(senha)){
                    System.out.println("Autenticacao realizada com sucesso.");
                    return 2;
                }
            }
        }

        return 0;
    }

    //Funcao para emitir um aviso para um funcionario
    public String emitirAviso(int id){
        String aviso;
        for(int i = 0; i<funcionario.length; i++){
            if(funcionario[i] != null && funcionario[i].getID() == id) {
                funcionario[i].setAviso(funcionario.length);
            }
        }

        return "Aviso nao pode ser enviado (Funcionario nao encontrado)";
    }

    public void getAvisos(int id){
        for(int i = 0; i<funcionario.length; i++){
            if(funcionario[i] != null && funcionario[i].getID() == id) {
                System.out.println("Escolha o aviso que você quer ler");
                int num = teclado.nextInt() - 1;
                System.out.println("Aviso "+num+": ");
                funcionario[i].getAviso(num);
            }
        }
    }
     public void getAvisosGerente(int id){
        for(int i = 0; i<gerente.length; i++){
            if(gerente[i] != null && gerente[i].getID() == id) {
                System.out.println("Escolha o aviso que você quer ler");
                int num = teclado.nextInt() - 1;
                System.out.println("Aviso "+num+": ");
                gerente[i].getAviso(num);
            }
        }
    }
    //Funcao para listar os ID e NOMES de todos os funcionarios
    public void listarFuncionarios(){
        for(int i = 0; i<funcionario.length; i++){
            if(funcionario[i] != null)
                System.out.println("ID: "+funcionario[i].getID()+" Funcionario: "+funcionario[i].getNome());
        }
    }

    //funcao para remover funcionario
    public String removerFuncionario(int IDFuncionario){
        for(int i = 0; i<funcionario.length; i++)
            if(funcionario[i] != null && funcionario[i].getID() == IDFuncionario)
                funcionario[i] = null;

        return "Funcionario removido!";
    }

    //funcao para resumo de UM funcionario especificado pelo UC7
    public void resumoFuncionario(int IDFuncionario){
        for(int i = 0; i<funcionario.length; i++)
            if(funcionario[i] != null && funcionario[i].getID() == IDFuncionario) {
                System.out.println(funcionario[i]);
                return;
            }

        System.out.println("Usuario não encontrado");
    }

    //funcao para resumo de TODOS os funcionarios especificado pelo UC7
    public void resumoFuncionarios(){
        String[] resumofuncionarios = new String[100];
        for(int i = 0; i<funcionario.length; i++)
            if(funcionario[i] != null) {
                resumofuncionarios[i] = "ID: "+funcionario[i].getID()+" Nome: "+funcionario[i].getNome()+". Cargo: "+funcionario[i].getCargo()+
                        ". Carga Horaria Semanal: "+funcionario[i].getCargaHoraria()+". Data de Ingresso: "+
                                funcionario[i].getDatadeIngresso()+". Tempo de Servico: "+funcionario[i].getTempoServico()+
                                    ". Numero de Alertas: "+funcionario[i].getNumAlertas();

                System.out.println(resumofuncionarios[i]);
            }

    }

    public Funcionario[] get_funcionarios(){
        return this.funcionario;
    }

    public Funcionario get_funcionario(int num){
        return this.funcionario[num];
    }

    public Gerente getGerente(){
        return this.gerente;
    }

    public void definirSalario(int id){
        for(int i = 0; i<funcionario.length; i++)
            if(funcionario[i] != null && funcionario[i].getID() == id ) {
                System.out.println("Insira o salario do funcionario:");
                int salario = teclado.nextInt();
                funcionario[i].setSalario(salario);
                System.out.println("Salario do funcionario definido com sucesso!");
                return;
            }

        System.out.println("Usuario não encontrado");
    }
}
