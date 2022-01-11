package day35_Encapsulation.encapsulation;

public class EmpolyeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Rostyslav",'M',25,125000);



        System.out.println(employee1);

        Employee employee2 = new Employee("Anastasia",'F',28,125000);
        employee2.setName("Kamal");

        System.out.println(employee2);
    }

}
