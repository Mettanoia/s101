package s101n1ex2.domain.model;

public class Cotxe {

    static final String marca = "Static final marca";
    private static String model;
    final String potencia;

    public Cotxe(String potencia) {
        this.potencia = potencia;
    }

    public static String getModel() {
        return model;
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant.");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant.");
    }

}
