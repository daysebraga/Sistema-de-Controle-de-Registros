public class Avisos {
    String corpo;

    public Avisos(){
        corpo = "";
    }

    public Avisos(String corpo){
        this.corpo = corpo;
    }

    public void setAviso(String corpo){
        this.corpo = corpo;
    }

    public String getAviso(){
        return this.corpo;
    }
}
