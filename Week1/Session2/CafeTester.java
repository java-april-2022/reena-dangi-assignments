public class CafeTester {
    
    public static void main(String[] bananas) {
       Cafe myCafe=new Cafe();
       
       myCafe.chaiLatte();
       myCafe.americano("Danny");
       myCafe.buildMenu();

      System.out.println(myCafe.customerList());
      myCafe.customerFavorites();
      String username=System.console().readLine();
    }
    // Array
    // ArrayLists
    // HashMap

    
}
