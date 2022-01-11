package day34_GarbegeCollection_AccessModifires;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("Construcotr");
    }

    public static void main(String[] args) {
        new Constructor_vs_StaticBlock(); // 1
        new Constructor_vs_StaticBlock(); // 2
        new Constructor_vs_StaticBlock(); // 3
        new Constructor_vs_StaticBlock(); // 4
        new Constructor_vs_StaticBlock(); // 5
    }

}
