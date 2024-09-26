package esercizio2;

public class Dirigente extends Dipendente {


    public Dirigente (String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }


    public double calculateSalary() {

        return getStipendio() * 12;
    }


}