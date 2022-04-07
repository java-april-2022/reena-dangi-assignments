import java.util.ArrayList;
import java.util.Random;

/**
 * HelloJava
 */
public class HelloJava {

    // entry Point
    public static void main(String[] args) {
        System.out.println("Hello Team Java!!");
       // Primitive Types
        // byte myAge=80;
        // int myInt=527253725;
        // long myLong=6767467676l;
        // float myFloat=160.89f;
        // double myDouble=180.7348738473;

        // // Non-Primitive Types - Objects
        // String student="Richard";
        // System.out.println("Hello welcome to Java, " + student.toUpperCase());
        // System.out.println(student.length());
        // greet();
        // greet("Danny");
        // greet("Josh","Data Science");
        // System.out.println(evenOdd(130));
        // System.out.println(evenOdd(131));
        // oneTo255();

        // ArrayList<Object> s=new ArrayList<Object>();
        // s.add("dbfjb");
        // s.add("dnkvn");

       //System.out.println(shuffleArray(s)); 
       
        
      
    }
    // Method Overloading
    public static void greet() {
        System.out.println("Hello, welcome to Coding Dojo!");
    }
    public static void greet(String studentName) {
        System.out.println("welcome to Coding Dojo " + studentName);
    }

    public static void greet(String studentName, String stack) {
        System.out.printf("Welcome to Coding Dojo %s To %s, this is going to be fun!!!", studentName, stack);
    }
    public static String evenOdd(int number) {
        if(number%2==0){
            return String.format("\n%d Is even", number);

        }else{
            return number + "Is Odd";
        }
    }
    // Loops 
    public static void oneTo255() {
        for(int i=1;i<=255;i++){
            System.out.println(evenOdd(i));
           
        }

        
    }
    public static ArrayList<Object> shuffleArray(ArrayList<Object> input) {
        Random random = new Random();
        for (int i = 0; i < input.size(); i++){
            int randIndex1 = random.nextInt(input.size());
            Object val1 = input.get(randIndex1);
            int randIndex2 = random.nextInt(input.size());
            Object val2 = input.get(randIndex2);
            Object temp = val1;
            // System.out.println(randIndex1 + " " + randIndex2+ " " + temp);
            // System.out.printf("Switching %s with %s%n", input.get(randIndex1), input.get(randIndex2));
            input.set(randIndex1, val2);
            input.set(randIndex2, temp);
            // System.out.println(input);
        }
        return input;
    }


    
}