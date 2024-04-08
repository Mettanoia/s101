package s101n1ex2.domain.model;

public class Main {
    public static void main(String[] args) {

        // Potencia is the only instance variable.
        var cotxe = new Cotxe("potencia inizialitzada");

        var marca = Cotxe.marca; // Static variable

        // It won't work since it is final.
        // Cotxe.marca = "Something";

        // This would work if it wasn't private. Pretty scary
        // Cotxe.model = "Something";

        cotxe.accelerar();

        Cotxe.frenar();

    }
}
