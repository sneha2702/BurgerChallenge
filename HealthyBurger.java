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
public class HealthyBurger extends Hamburger {
    
    public HealthyBurger( String meat, double price) {
        super("Healthy","Brown Rye", meat, price);
    }
    private String healthyAdd1;
    private double healthyAmount1;
    private String healthyAdd2;
    private double healthyAmount2;
    
    public void healthyAddition1(String name,double price){
        healthyAdd1=name;
        healthyAmount1=price;
    }
    public void healthyAddition2(String name,double price){
        healthyAdd2=name;
        healthyAmount2=price;
    }

    @Override
    public double calculatePrice() {
        double healthyPrice= super.calculatePrice(); 
        if(healthyAdd1!=null){
            healthyPrice+=healthyAmount1;
        }
        if(healthyAdd2!=null){
            healthyPrice+=healthyAmount2;
        }
        return healthyPrice;
    }
    
}
