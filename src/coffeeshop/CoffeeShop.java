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
        Coffee drink;
        if(input.order().equals("Americano")){
            drink = new Americano();
        }else if(input.order().equals("Latte")){
            drink = new Latte();
        }else{
            drink = new BlackCoffee();
        }
        
        //create order
        Order order = new Order(input, drink);
        order.makeDrink();
        
    }
    
}
