package s101n1ex1;


import s101n1ex1.domain.model.CheckMyStaticVarItIsSoCool;
import s101n1ex1.domain.model.InstantiateMeIHaveLotsOfStaticInitializationBlocks;

public class Main {
    public static void main(String[] args) {

        System.out.println(CheckMyStaticVarItIsSoCool.dummyStaticVar);

        new InstantiateMeIHaveLotsOfStaticInitializationBlocks();

        new InstantiateMeIHaveLotsOfStaticInitializationBlocks();

        System.out.println(CheckMyStaticVarItIsSoCool.dummyStaticVar);

    }
}
