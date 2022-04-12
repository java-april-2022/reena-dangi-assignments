import java.util.ArrayList;

/**
 * Employee - By Reena
 */
public class Employee {

    // Access modifiers - Abstraction
    // Class- Attributes
    private String email;
    private float pay;
    private ArrayList<String> skillSet=new ArrayList<>();
    
    // Static member
    private static int noOfEmployees;

    // Constructors
    public Employee(){
        noOfEmployees++;

    }
    public Employee(String email,float pay){
        noOfEmployees++;
        this.email=email;
        this.pay=pay;
    }

    // Accessors/getters & Mutators/setters
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPay(float pay) {
        this.pay = pay;
    }
    public float getPay() {
        return pay;
    }
    public void setSkillSet(ArrayList<String> skillSet) {
        this.skillSet = skillSet;
    }
    public ArrayList<String> getSkillSet() {
        return skillSet;
    }
    // Static Method
    public static int getNoOfEmployees() {
        return noOfEmployees;
    }
    // Class methods
    public void empDetails() {
        System.out.println("*******************************************");
        System.out.printf("Emp email:%s\t Emp Pay:%.2f\n", this.email,this.pay);
        try {
            for (String skill : this.skillSet) {
                System.out.println(skill);
    
                
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
       
    }
    public void addSkill(String newSkill) {
        this.skillSet.add(newSkill);

        
    }

    // Polymorphisum - Method Overloading - polymorphism
    public void bonus() {
        this.pay+=200;        
    }
    public void bonus(float amount) {
        this.pay+=amount;
    }


}