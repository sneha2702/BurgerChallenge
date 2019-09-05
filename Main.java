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
public class Main {
    public static void main(String[] args) {
        Hamburger ham= new Hamburger("Hammy","White bread","chicken",2.5);
        ham.addAddition1("tomato", 2);
        System.out.println( ham.calculatePrice());
        HealthyBurger hb= new HealthyBurger("chicken", 5);
        hb.addAddition1("lettce", 1);
        System.out.println(hb.calculatePrice());
        Deluxe del= new Deluxe();
        del.addAddition1("tom", 2);
        System.out.println(del.calculatePrice());
    }
    
}
