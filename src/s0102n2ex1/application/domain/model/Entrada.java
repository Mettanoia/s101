package s0102n2ex1.application.domain.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    static final class FormatChecker {
        public static String checkFormat(Format format, String input) throws InputMismatchException {

            switch (format) {

                case AGE -> {
                    int castInput;
                    try {
                        castInput = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        throw new InputMismatchException("Input must be an integer number.");
                    }

                    // Unreachable code in case we cannot cast to int
                    if(castInput > 120 || castInput < 0)
                        throw new InputMismatchException("It must be an actual age.");

                }

                case WORD -> {

                    if (!(input.matches("[a-zA-Z]*")))
                        throw new InputMismatchException("The input must contain only characters.");

                }

                case EMAIL -> {

                    if (!(input.matches("(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$")))
                        throw new InputMismatchException("The input must contain a properly formatted email.");

                }

                case PHONE_NUMBER -> {

                    if (!(input.matches("^(\\\\+\\\\d{1,3}( )?)?(\\\\d{3}[ ]?)(\\\\d{2}[ ]?){2}\\\\d{2}$")))
                        throw new InputMismatchException("The input must contain a properly formatted phone number.");

                }

                case CHAR -> {

                    if (!(input.matches("^[a-zA-Z]$")))
                        throw new InputMismatchException("The input must consist in a single character.");

                }

                case BOOL -> {

                    if (!(input.equals("s") || input.equals("n")))
                        throw new InputMismatchException("The only available values are s or n.");

                }

            }

            return input;

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    private static String checkFormat(String missatge, Format format){

        var inputAccepted = false;
        String output = null; // Weird initialization, check it later

        while (!inputAccepted){
            try {

                System.out.println(missatge);

                output = scanner.next();

                FormatChecker.checkFormat(format, output);

                inputAccepted = true;

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }

        return output;

    }

    public static byte llegirByte(String missatge, Format format) {

       return Byte.parseByte(checkFormat(missatge, format)); // Pseudo-forwarding method.

    }

    public static int llegirInt(String missatge, Format format){

        return Integer.valueOf(checkFormat(missatge, format)); // Pseudo-forwarding method.

    }

    public static float llegirFloat(String missatge, Format format){

        return Float.valueOf(checkFormat(missatge, format)); // Pseudo-forwarding method.

    }

    public static double llegirDouble(String missatge, Format format){

        return Double.valueOf(checkFormat(missatge, format)); // Pseudo-forwarding method.

    }

    public static char llegirChar(String missatge, Format format){

        return Character.valueOf(checkFormat(missatge, format).charAt(0)); // Pseudo-forwarding method.

    }

    public static String llegirString(String missatge, Format format){

        return checkFormat(missatge, format); // Pseudo-forwarding method.

    }

    public static boolean llegirSiNo(String missatge, Format format){

        return checkFormat(missatge, format).equals("s");

    }

}
