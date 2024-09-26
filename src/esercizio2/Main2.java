package esercizio2;

public class Main2 {
    public static void main(String[] args) {

        DipendenteFullTime dip1 = new DipendenteFullTime("A123", 2000.00, Dipendente.Dipartimento.VENDITE);
        DipendentePartTime dip2 = new DipendentePartTime("B456", 15.00, Dipendente.Dipartimento.PRODUZIONE, 20);
        Dirigente dip3 = new Dirigente("C789", 2800.00, Dipendente.Dipartimento.AMMINISTRAZIONE);


        Dipendente[] dipendenti = {dip1, dip2, dip3};


        for (Dipendente dipendente : dipendenti) {

            System.out.println("Stipendio totale: " + dipendente.calculateSalary());
        }
    }
}
