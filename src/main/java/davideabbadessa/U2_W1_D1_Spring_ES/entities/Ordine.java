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


}
