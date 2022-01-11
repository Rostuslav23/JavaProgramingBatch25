package day36_Inheritance.Employee;

public class EmployeeObject {

    public static void main(String[] args) {



        Tester tester = new Tester();
        tester.setInfo("Rostyslav",'M',20,6,"SDET",130000);
        System.out.println(tester);
        tester.work();
        tester.creatingTicket();
        tester.testing();
        System.out.println();


        Developer developer = new Developer();
        developer.setInfo("Marius",'M',21,69,"Developer",135000);
        developer.work();
        developer.coding();
        developer.fixingBugs();
        System.out.println(developer);

        System.out.println();


        Teacher teacher = new Teacher();
        teacher.setInfo("Serghei",'M',27,11,"Java Teacher",100000);
        teacher.work();
        teacher.teaching();
        System.out.println(teacher);

        System.out.println();


        Driver driver = new Driver();
        driver.setInfo("Hulia",'F',25,81,"Truck Driver",170000);
        driver.work();
        driver.driving();
        System.out.println(driver);



    }

}
/*
Create a class named Employee Objects and and test of the sub class' objects
 */