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
public class Hamburger {
    //instance variables or fields
    private String breadRollType;
    private String meat;
    private String name;
    private double price;
    private String addAddition1;
    private String addAddition2;
    private String addAddition3;
    private String addAddition4;
    private double additionAmount1;
    private double additionAmount2;
    private double additionAmount3;
    private double additionAmount4;

    public Hamburger(String name,String breadRollType, String meat,double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price=price;
        this.name=name;
    }

  /*  public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
*/
   public void addAddition1(String name, double price){
       addAddition1=name;
       additionAmount1=price;
   }
   public void addAddition2(String name, double price){
       addAddition2=name;
       additionAmount2=price;
   }   
   public void addAddition3(String name, double price){
       addAddition3=name;
       additionAmount3=price;
   }   
   public void addAddition4(String name, double price){
       addAddition4=name;
       additionAmount4=price;
   }
   
    
    public double calculatePrice()
    {
        double hamPrice=price;
        if(addAddition1!=null){
           hamPrice+=additionAmount1; 
        }
        if(addAddition2!=null){
            hamPrice+=additionAmount2;
        }
        if(addAddition3!=null){
            hamPrice+=additionAmount3;
        }
        if(addAddition4!=null){
            hamPrice+=additionAmount4;
        }
        return hamPrice;
    }
    
    
    
    
}
