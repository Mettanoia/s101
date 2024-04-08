package s101n1ex1.domain.model;

public class CheckMyStaticVarItIsSoCool {

    public static String dummyStaticVar = "This is STATIC VARIABLE inside " + CheckMyStaticVarItIsSoCool.class.getName() + ".";

    private void CheckMyStaticMethodItIsSocool(){}

    static {
        System.out.println("Class initialized! This is the STATIC initialization block inside " + CheckMyStaticVarItIsSoCool.class.getName() + ".");
    }

}
