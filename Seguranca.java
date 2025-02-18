import java.util.Scanner;

public class Seguranca {
    Funcionario[] funcionario = new Funcionario[100];
    Gerente gerente = new Gerente();

    public Seguranca(){}

    Scanner teclado = new Scanner(System.in);

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

                    funcionario[i] = new Funcionario(nome, genero, dataDeNascimento, cargo, cargaHorariaSemanal,
                            id, senha, tempoServico);

                    break;
                }
            }

        }else{
            return "Cadastro não realizado";
        }

        return "Cadastro realizado";
    }

    public String cadastroGerente(){
        if(gerente == null) {
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

    public String emitirAviso(int id){
        String aviso;
        for(int i = 0; i<funcionario.length; i++){
            if(funcionario[i].getID() == id) {
                for (int j = 0; j < funcionario.length; j++) {
                    if (funcionario[i].getAviso(j) == null) {
                        teclado = new Scanner(System.in);
                        System.out.println("Escreva o aviso:");
                        aviso = teclado.nextLine();
                        funcionario[i].addAviso(j, aviso);
                        return "Aviso enviado com sucesso";
                    }
                }
            }
        }

        return "Aviso nao pode ser enviado (Funcionario nao encontrado)";
    }

    public void listarFuncionarios(){
        for(int i = 0; i<funcionario.length; i++){
            System.out.println(funcionario[i]);
        }
    }

    public String removerFuncionario(int IDFuncionario){
        return "removido";
    }

    public String resumoFuncionario(int IDFuncionario){
        return "resumo";
    }

    public String[] resumoFuncionarios(){
        String[] resumofuncionarios = new String[10];
        return resumofuncionarios;
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
}
