package esercizio2;

public class DipendentePartTime extends Dipendente {

    private int oreSettimanali;

    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento, int oreSettimanali) {
        super(matricola, stipendio, dipartimento);
        this.oreSettimanali = oreSettimanali;
    }



    public double calculateSalary() {
        return getStipendio() * oreSettimanali * 4 *12;
    }


}
