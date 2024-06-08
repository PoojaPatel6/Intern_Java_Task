import java.util.Arrays;
// ArrayIndexOutOfBoundsException
@SuppressWarnings("unused")
class Shopping {
  
  public static void main(String[] args) {
    
    String[] groceryItems = {"steak", "milk", "jelly beans"};
    double[] prices = {25.00, 2.95, 2.50};
    
    // Adding ham to the groceries
    groceryItems[3] = "ham";
    prices[2] = 4.99;
    
  }
  
}
