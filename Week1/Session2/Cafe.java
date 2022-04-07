import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Cafe {

    public void chaiLatte() {
        System.out.println("Welcome, here is your ChaiLatte");
        
    }
    public void americano(String name) {
        System.out.printf("Welcome %s, here is your Americano\n",name);
        
    }
    // Array
    public void buildMenu() {
        String[] menu={"Chai","Hot Chocolate", "Frappuccino"};
        System.out.println(menu[0]);
        System.out.println(Arrays.toString(menu));
        for (String item : menu) {
            System.out.println(item);
        }

        int[] numbers=new int[5];
        numbers[0]=10;
        numbers[1]=20;
        try{
            numbers[6]=90;
        }
        catch(Exception e){
            System.out.println("Hey, you need more work on Arrays!");

        }
        System.out.println(Arrays.toString(numbers));
    }
    public ArrayList<String> customerList(){
        ArrayList<String> customers=new ArrayList<>();
        customers.add("Sarah");
        customers.add("Diana");
        customers.add("Jamal");
        // push
        customers.add("Reena");
        // Pop
        customers.remove(3);
        System.out.println(customers);
        System.out.println(customers.get(2));
        System.out.println(customers.size());
        return customers;

    }
    public void customerFavorites(){
        HashMap<String,String> favorites=new HashMap<String,String>();
        favorites.put("Reena","Thai Tea");
        favorites.put("Josh","Oolong Tea");
        favorites.put("Josh","Tea");
        favorites.put("Alex","Espresso");
        favorites.put("Herlan", "Passion Fruit");
        favorites.put("Diana", "lemonade");

        System.out.println(favorites.get("Josh")); 
        System.out.println("No of favorites drinks in cafe:\t"  + favorites.size());
        System.out.println(favorites);
        
        for (String key : favorites.keySet()) {
            System.out.printf("%s's favorite drink in Cafe is %s\n",key,favorites.get(key));
            
            // if(favorites.get(key).equals("Thai tea")){

            // }

        }









    }



}
