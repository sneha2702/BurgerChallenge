/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bills;

/**
 *
 * @author Arun Reddy
 */
public class Deluxe extends Hamburger{
    
    public Deluxe() {
        super("Deluxe","white","C & C", 10);
        super.addAddition1("chips", 2);
        super.addAddition2("Drink",1.5);
    }
    public void addAddition1(String name, double price){
        System.out.println("cannot be done");
   }
   public void addAddition2(String name, double price){
    System.out.println("cannot be done");
   }   
   public void addAddition3(String name, double price){
     System.out.println("cannot be done");
   }   
   public void addAddition4(String name, double price){
     System.out.println("cannot be done");
   }
    
}
