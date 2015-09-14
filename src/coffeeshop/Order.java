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
    private String order;
    private Input input;
    private Printer output;
    
    public Order(String order, Input input , Coffee drink, Printer output){
        this.order = order;
        this.input = input;
        this.drink = drink;
        this.output = output;
    }
    
    //take order from input and make coffee drink
    public String makeDrink(){
        coffeeDrink = order;
        String drinkInfo = drink.makeDrink();
        return "Here is your " + drinkInfo  + coffeeDrink;
    }

    public String getCoffeeDrink() {
        return coffeeDrink;
    }
    
}
