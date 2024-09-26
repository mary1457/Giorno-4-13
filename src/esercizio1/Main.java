package esercizio1;

public class Main {
    public static void main(String[] args) {

        Dipendente dip1 = new Dipendente("A123", 2000.00, Dipendente.Dipartimento.VENDITE);
        Dipendente dip2 = new Dipendente("B456", 2500.00, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente dip3 = new Dipendente("C789", 2800.00, Dipendente.Dipartimento.AMMINISTRAZIONE);


        Dipendente[] dipendenti = {dip1, dip2, dip3};


        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola dipendente: " + dipendente.getMatricola());
        }
    }
}
