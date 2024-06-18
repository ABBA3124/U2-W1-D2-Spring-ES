package davideabbadessa.U2_W1_D1_Spring_ES.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private String stato; // in corso, pronto, servito    // valuterò dopo se usare enum
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private List<ProvaAstratta> elementiMenu;
    private double importoTotale;
    private Tavolo tavolo;


    public Ordine(int numeroOrdine, String stato, int numeroCoperti, LocalDateTime oraAcquisizione, Tavolo tavolo) {
        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.elementiMenu = new ArrayList<>();
        this.tavolo = tavolo;
    }

    public void aggiungiElementoMenu(ProvaAstratta elemento) {
        elementiMenu.add(elemento);
        importoTotale += elemento.getPrice();
    }

    public void calcolaImportoTotale(double costoCoperto) {
        importoTotale += numeroCoperti * costoCoperto;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public LocalDateTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalDateTime oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public List<ProvaAstratta> getElementiMenu() {
        return elementiMenu;
    }

    public void setElementiMenu(List<ProvaAstratta> elementiMenu) {
        this.elementiMenu = elementiMenu;
    }

    public double getImportoTotale() {
        return importoTotale;
    }

    public void setImportoTotale(double importoTotale) {
        this.importoTotale = importoTotale;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    @Override
    public String toString() {
        return "ORDINE: " +
                "Numero Ordine: " + numeroOrdine +
                ", Stato: " + stato +
                ", Numero Coperti:" + numeroCoperti +
                ", Ora Acquisizione: " + oraAcquisizione +
                ", Alimenti Ordinati: " + elementiMenu +
                ", Totale Importo Tavolo: " + importoTotale +
                ", INFO TAVOLO: " + tavolo;
    }
}
