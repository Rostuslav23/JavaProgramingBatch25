package day37_Inheritance.SrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender,  int id, double salary, String companyNamel) {
        super(name, age, gender, "Business Analyst", id, salary, companyNamel);
    }

    public void analyze(){
        System.out.println(name+ " is analyzing the documents");

    }

}
