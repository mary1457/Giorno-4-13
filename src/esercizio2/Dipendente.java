package esercizio2;


public abstract class Dipendente {


    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public abstract double calculateSalary();


    public enum Dipartimento {
        PRODUZIONE,
        AMMINISTRAZIONE,
        VENDITE
    }


    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }




    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


}
