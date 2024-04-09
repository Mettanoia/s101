package s0102n1ex1;

import s0102n1ex1.application.domain.model.Producte;
import s0102n1ex1.application.domain.model.Venda;
import s0102n1ex1.application.domain.model.VendaBuidaException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda".
 * Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.
 *
 * La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada VendaBuidaException i mostra per pantalla
 * “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la col·lecció té productes,
 * llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.
 *
 * L’excepció personalitzada VendaBuidaException ha de ser filla de la classe Exception. Al seu constructor li hem de passar el missatge
 * “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.
 *
 * Escriu el codi necessari per a generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException.
 */

public class Main {
    public static void main(String[] args) {

        // First let's create a List of products and let's check that the method works

        System.out.println("This should be the correct sum of all the preus:");

        var productes = new ArrayList<Producte>(){{
            add(new Producte("Producte 1", BigDecimal.valueOf(23.5)));
            add(new Producte("Producte 2", BigDecimal.valueOf(12.3)));
            add(new Producte("Producte 3", BigDecimal.valueOf(9.7)));
            add(new Producte("Producte 4", BigDecimal.valueOf(24.4)));
            add(new Producte("Producte 5", BigDecimal.valueOf(4.4)));
            add(new Producte("Producte 6", BigDecimal.valueOf(67.9)));
            add(new Producte("Producte 7", BigDecimal.valueOf(3.5)));
            add(new Producte("Producte 8", BigDecimal.valueOf(50.5)));
        }};

        var venda = new Venda(productes, BigDecimal.valueOf(0.0));

        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }

        System.out.println(venda.getPreuTotal());
        System.out.println();

        // Now let's recreate a situation in which the productes list is empty

        System.out.println("This should throw the exception and show he error message:");

        var productes2 = new ArrayList<Producte>();

        venda = new Venda(productes2, BigDecimal.valueOf(0.0));

        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }

        // This will always be equal to 0
        System.out.println(venda.getPreuTotal());
        System.out.println();

        // Let's create the necessary code to throw and catch an ArrayIndexOutOfBoundsException

        System.out.println("This should show the message from the ArrayIndexOutOfBoundsException:");

        int[] ints = {};

        try {
            int anInt = ints[0]; // Illegal index
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage()); // Print the message of the Exception
        }

    }

}
