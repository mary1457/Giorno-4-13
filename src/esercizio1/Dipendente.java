package esercizio1;

public class Dipendente {


    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;


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


    public String getMatricola() {
        return matricola;
    }





    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


}
