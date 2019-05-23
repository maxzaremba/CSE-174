/* ShoppingCart class
 * used for creating cart Objects
 */
import java.util.*;

public class ShoppingCart 
{
   private ArrayList<Order> orders;
   
   public ShoppingCart() {
    orders = new ArrayList<Order>();
   }
   
   public void addOrder(Order o) {
    orders.add(o);
   }
   
   public void listOrders() {
     if (orders.size()==0)
       System.out.println("No orders placed yet!");
     else {
       System.out.println("Orders placed in the Cart!");
       for(Order o: orders)
         System.out.println(o);
     }
   }
   
   public void getSize() {
     System.out.println(orders.size());
   }
   public double getBill() {
    double bill=0.0;
    
    for(Order o: orders)
     bill+=(o.getPrice_unit()*o.getUnits());
     
    return bill;
   }
}
