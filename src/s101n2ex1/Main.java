package s101n2ex1;

import s101n2ex1.domain.model.Smartphone;

public class Main {
    public static void main(String[] args) {

        var smartphone = new Smartphone("marca", "model");

        smartphone.fotografiar();
        smartphone.alarma();;
        smartphone.trucar("+34756893011");

    }
}
