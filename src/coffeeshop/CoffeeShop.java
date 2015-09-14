/*
 * Coffee shop class demo 9/14/15
 */
package coffeeshop;

/**
 *
 * @author Alyson
 */
public class CoffeeShop {

   
    public static void main(String[] args) {
        
        //create input object, drink object, size object?, milk object?
        Input input = new ConsoleOrderInput();
        if(input.order().equals("Americano")){
            MakeCoffee drink = new Americano();
        }else if(input.order().equals("Latte")){
            MakeCoffee drink = new Latte();
        }else{
            MakeCoffee drink = new BlackCoffee();
        }
    }
    
}
