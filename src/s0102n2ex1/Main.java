package s0102n2ex1;

import s0102n2ex1.application.domain.model.Entrada;
import s0102n2ex1.application.domain.model.Format;

/**
 * Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar les diferents excepcions que poden
 * aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la classe Scanner.
 *
 * El primer que s’ha de fer és instanciar un objecte de la classe Scanner i a partir d’aquí, crear mètodes estàtics
 * per llegir els diferents tipus de dades des del teclat.
 *
 *  Important
 *
 * És important que si en algun mètode salta una excepció, la tractem i tornem a demanar la dada a l’usuari/ària fins
 * que aquesta estigui ben introduïda. Per exemple: Si introdueix un float amb un punt en lloc d'amb una coma,
 * ha de mostrar “Error de format”. Fins que l’usuari/ària no introdueix un float ben format ha de seguir demanant la dada.
 *
 * Tots els mètodes reben un String amb el missatge que es vol mostrar a l’usuari/ària, per exemple:
 * “Introdueix la teva edat”, i retornen la dada oportuna introduïda per l’usuari/ària en cada mètode,
 * per exemple: un byte amb l’edat de l’usuari/ària.
 *
 * Mètodes a implantar capturant l’excepció de la classe InputMismatchException:
 *
 * public static byte llegirByte(String missatge);
 *
 * public static int llegirInt(String missatge);
 *
 * public static float llegirFloat(String missatge);
 *
 * public static double llegirDouble(String missatge);
 *
 * Mètodes a implantar capturant l’excepció de la classe Exception:
 *
 * public static char llegirChar(String missatge);
 *
 * public static String llegirString(String missatge);
 *
 * public static boolean llegirSiNo(String missatge), si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”, retorna “false”.
 */

public class Main {
    public static void main(String[] args) {

        var age = Entrada.llegirInt("Introduce tu edad:", Format.AGE);
        System.out.println("The introduced age is: " + age);

        var name = Entrada.llegirString("Introduce tu nombre:", Format.WORD);
        System.out.println("The introduced name is: " + name);

        var character = Entrada.llegirChar("Introduce tu inicial:", Format.CHAR);
        System.out.println("The introduced char is: " + character);

        var phoneNumber = Entrada.llegirString("Introduce tu telefono:", Format.PHONE_NUMBER);
        System.out.println("Your answer: " + phoneNumber);

        var yesNo = Entrada.llegirSiNo("¿Te ha gustado el experimento?", Format.BOOL);
        System.out.println("Your answer: " + yesNo);

    }
}