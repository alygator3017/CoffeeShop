/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeshop;

/**
 *
 * @author Alyson
 */
public class BlackCoffee implements Coffee, Creamer, Milk {

    @Override
    public void makeDrink() {
        System.out.println("In Black Coffee Make Drink");
    }

    @Override
    public void addCream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void typeOfMilk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
