package s101n2ex1.domain.model;

public class Smartphone extends Telephone implements Camera, Rellotge{

    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l’alarma");
    }

    // TODO review this design decision
    public void trucar(String telephoneNumber){
        super.trucar(telephoneNumber);
    }

}
