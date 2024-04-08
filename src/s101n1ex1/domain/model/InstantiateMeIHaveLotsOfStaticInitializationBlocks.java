package s101n1ex1.domain.model;

public class InstantiateMeIHaveLotsOfStaticInitializationBlocks {

    public InstantiateMeIHaveLotsOfStaticInitializationBlocks(){
        System.out.println("This is the CONSTRUCTOR of " + this.getClass().getName() + ".");
    }

    static {
        System.out.println("Class initialized! This is the STATIC initialization block inside " + InstantiateMeIHaveLotsOfStaticInitializationBlocks.class.getName() + ".");
    }

    {
        System.out.println("Class initialized! This is the INSTANCE initialization block inside " + this.getClass().getName() + ".");
    }

}
