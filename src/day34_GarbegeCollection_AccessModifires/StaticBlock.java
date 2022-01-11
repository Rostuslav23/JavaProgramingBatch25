package day34_GarbegeCollection_AccessModifires;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static { // runs first before anything ,and only runs one time
        System.out.println("Static Block");
    }

    static { // runs first before anything ,and only runs one time
        System.out.println("Static Block 2");
    }
    static { // runs first before anything ,and only runs one time
        System.out.println("Static Block 3");
    }

}
