package coffeeshop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alyson
 */
public class Order {
    //properties
    private String coffeeDrink;
    //getting the drink object
    private Coffee drink;
    private String input;
    
    public Order(String input, Coffee drink){
        this.input = input;
        this.drink = drink;
    }
    
    //take order from input and make coffee drink
    public void makeDrink(){
        coffeeDrink = input;
        drink.makeDrink();
    }

    public String getCoffeeDrink() {
        return coffeeDrink;
    }
    
}
