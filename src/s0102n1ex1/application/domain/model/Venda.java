package s0102n1ex1.application.domain.model;

import java.math.BigDecimal;
import java.util.List;


public final class Venda {

    private final List<Producte> productes;
    private BigDecimal preuTotal; // Item 60 Effective Java

    public Venda(List<Producte> productes, BigDecimal preuTotal) {
        this.productes = productes;
        this.preuTotal = preuTotal;
    }

    public List<Producte> getProductes() {
        return productes;
    }

    public BigDecimal getPreuTotal() {
        return preuTotal;
    }

    public void calcularTotal() throws VendaBuidaException{

        // Fail fast
        if (productes.isEmpty())
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");

        for (Producte p: productes){
            preuTotal = preuTotal.add(p.preu());
        }

    }

}
