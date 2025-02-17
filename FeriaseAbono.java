public class FeriaseAbono {

    int Ferias;
    int Abono;

    int calculoAbono(int tempo, int abonoF){

        Abono = tempo/60 + abonoF;

        if (Abono == 0) {
            System.out.println("Você não abonos disponiveis.");
            return Abono;
        }else if(Abono == 1){
            System.out.println("Você tem "+Abono+" semana de abono disponivel.");
            return Abono;
        }else if (Abono > 1) {
            System.out.println("Você tem " +Abono+ " semanas de abo.nos disponiveis");
            return Abono;
        }

        return 0;
    }

    int calculoFerias(int tempo, int feriasF) {

        Ferias = tempo / 365 + feriasF;

        if (Ferias == 0) {
            System.out.println("Você não ferias disponiveis.");
            return Abono;
        }else if(Ferias == 1){
            System.out.println("Você tem "+Ferias+" mes de ferias disponivel.");
            return Ferias;
        }else if (Ferias > 1) {
            System.out.println("Você tem " +Ferias+ " meses de ferias disponiveis.");
            return Ferias;
        }

        return 0;
    }
}
