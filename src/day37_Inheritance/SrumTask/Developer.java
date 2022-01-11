package day37_Inheritance.SrumTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyNamel) {
        super(name, age, gender, jobTitle, id, salary, companyNamel);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is fixing bugs");
    }

}
