package day37_Inheritance.SrumTask;

public class Employee extends Person{

    public String jobTitle;
    public int id;
    public double salary;
    public String companyNamel;


    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyNamel) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyNamel = companyNamel;
    }

    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ",jobTitle='" + jobTitle + '\'' +
                ", salary = $ " + salary +
                ", companyNamel='" + companyNamel + '\'' +
                '}';
    }
}
/*
        name, gender, age, jobTitle, id, salary, companyName
        work(), toString()
 */