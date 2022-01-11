package day37_Inheritance.SrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";
        ProductOwner po = new ProductOwner("Rostyslav",25,'M',23,170000,company);

        BusinessAnalyst ba = new BusinessAnalyst("Ira",28,'F',11,140000,company);

        ScrumMaster sm = new ScrumMaster("Marius",30,'M',4,115000,company);

        Tester tester1=new Tester("Chinara",32,'F',"QA",124,125000,company);

        Tester tester2=new Tester("Yasaman",31,'F',"QE",12,130000,company);

        Tester tester3=new Tester("Irena",29,'F',"SDET",5,128000,company);

        Tester tester4=new Tester("Cihad",26,'M',"QA",9,125000,company);
        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1 = new Developer("Rara",27,'F',"Java Developer",3,120000,company);

        ScrumTeam scrumTeam = new ScrumTeam( po , ba , sm );
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("_-----------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" : "+ tester.salary);
        }


    }

}
