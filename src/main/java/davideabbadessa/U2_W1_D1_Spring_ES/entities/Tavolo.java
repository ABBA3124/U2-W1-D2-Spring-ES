package davideabbadessa.U2_W1_D1_Spring_ES.entities;

public class Tavolo {
    private int numero;
    private int numeroCoperti;
    private boolean occupato;


    public Tavolo(int numero, int numeroCoperti, boolean occupato) {
        this.numero = numero;
        this.numeroCoperti = numeroCoperti;
        this.occupato = occupato;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public boolean isOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", numeroCoperti=" + numeroCoperti +
                ", occupato=" + occupato +
                '}';
    }
}
