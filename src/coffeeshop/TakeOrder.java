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
public class TakeOrder {
    //properties
    private String coffeeDrink;
    //getting the drink object
    private MakeCoffee drink;
    private Input input;
    
    public TakeOrder(Input input, MakeCoffee drink){
        this.input = input;
        this.drink = drink;
    }
    
    //take order from input and make coffee drink
    public void makeDrink(){
        coffeeDrink = input.order();
        drink.makeDrink();
    }

    public String getCoffeeDrink() {
        return coffeeDrink;
    }
    
}
