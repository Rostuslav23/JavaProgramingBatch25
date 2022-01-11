package day30_CustomClass;

import java.util.ArrayList;

public class StudenObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Ross",'M',25,232323,'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 2123,'B');

        Student student3 = new Student();
        student3.setInfo("Mert", 'M', 26, 21233,'C');

        Student student4 = new Student();
        student4.setInfo("Andrew", 'M', 26, 2123,'C');

        Student student5 = new Student();
        student5.setInfo("Liza", 'F', 22, 2123,'A');

        Student[] students = {student1,student2,student3,student4,student5};

        for (Student student: students) {
            System.out.println(student);

        }
        System.out.println("-------------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade : A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student:students){
            if (student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);
    }
}
