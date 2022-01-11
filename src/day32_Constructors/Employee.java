package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobtitle;
    public double salary;

    public Employee(String name){
        this.name = name;
    }
    public Employee (String name, char gender){
        this(name); // this.name = name;
        this.gender = gender;
    }

    public Employee (String name,char gender , String jobtitle){
        this(name,gender);
        this.jobtitle = jobtitle;
    }

    public Employee(String name,char gender , String jobtitle,double salary){
        this(name,gender,jobtitle);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
