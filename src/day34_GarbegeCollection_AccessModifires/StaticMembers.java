package day34_GarbegeCollection_AccessModifires;

public class StaticMembers { // public modifires

    int a;

    static class  class1{ //default modifire

    }

    public static int num = 100;

    public static void method(){

    }

    static {

    }







}

class A{ // outer class

    static  class B { // inner class

        public static void method1(){

        }
    }
        }

        class C{
            public static void main(String[] args) {
                A.B.method1();
            }
        }