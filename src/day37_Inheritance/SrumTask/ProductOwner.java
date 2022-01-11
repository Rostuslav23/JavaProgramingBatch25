package day37_Inheritance.SrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, double salary, String companyNamel) {
        super(name, age, gender,"Product Owner", id, salary, companyNamel);

    }

    public void manage(){
        System.out.println(name + " is managing the company");
    }
}
