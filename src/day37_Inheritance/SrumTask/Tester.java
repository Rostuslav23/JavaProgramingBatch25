package day37_Inheritance.SrumTask;

public class Tester extends Employee{ // Tester IS A Employee, Tester IS A Person

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyNamel) {
        super(name, age, gender, jobTitle, id, salary, companyNamel);
    }
    public void createTicket(){
        System.out.println(jobTitle+ " "+ name+ " is creating a ticket");
    }
}