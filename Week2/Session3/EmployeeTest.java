import java.util.ArrayList;

/**
 * EmployeeTest - By Reena
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee paige=new Employee();
        Employee sam=new Employee("sam@myCafe.com",210000);
        Employee taro=new Employee("taro@myCafe.com",300000);


        // paige.email="paige.myCafe.com";
        // paige.pay=200000;
        paige.setEmail("paige.myCafe.com");
        paige.setPay(200000);
        // System.out.println( paige.getEmail());
        paige.empDetails();
        sam.empDetails();

        System.out.println("No of employees " + Employee.getNoOfEmployees() );

        paige.bonus();
        float amount=(float) taro.getPay()*.1f;
        taro.bonus(amount);
        paige.empDetails();
        taro.empDetails();

        ArrayList<String> samSkills=new ArrayList<>();
        samSkills.add("Being Nice");
        samSkills.add("Don't be rude");
        samSkills.add("Making fancy coffee!");
        samSkills.add("Quick");

        sam.setSkillSet(samSkills);
        sam.empDetails();
        paige.addSkill("Latte art");
        paige.empDetails();




        



           

    }
    
}
