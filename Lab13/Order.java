/* Order Class 
 * used for creating Order Objects in the Shopping Cart
 */

public class Order
{ 
 private int bar_code;
 private String name;
 private int units;
 private double price_unit;
 
 /** The Order constructor  
  * 
  * */
 public Order(int bar_code, String name, int units, double price_unit) {
  this.setBar_code(bar_code);
  this.setName(name);
  this.setUnits(units);
  this.setPrice_unit(price_unit);
 }
 
 public int getBar_code() {
  return bar_code;
 }
 
 public void setBar_code(int bar_code) {
  this.bar_code = bar_code;
 }
 
 public String getName() {
  return name;
 }
 
 public void setName(String name) {
  this.name = name;
 }
 
 public int getUnits() {
  return units;
 }
 
 public void setUnits(int units) {
  this.units = units;
 }
 
 public double getPrice_unit() {
  return price_unit;
 }
 
 public void setPrice_unit(double price_unit) {
  this.price_unit = price_unit;
 }

 public String toString() {
  return  this.getBar_code() + "; " +
    this.getName() + "; " +
    this.getUnits() +"; " +
    this.getPrice_unit();
 }
 
}
