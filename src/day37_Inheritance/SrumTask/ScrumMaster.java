package day37_Inheritance.SrumTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyNamel) {
        super(name, age, gender, "Scrum Master", id, salary, companyNamel);
    }

    public void facilitate(){
        System.out.println(jobTitle + " " +name + " is facilitating ");
    }

}
