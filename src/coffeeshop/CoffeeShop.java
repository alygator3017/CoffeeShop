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
        Printer printer = new ConsolePrinter();
        Input input = new ConsoleOrderInput();
        //Drink Order String
         //ask for order
        printer.println("What kind of drink would you like? We have an Americano, a latte or a coffee");
        String drinkOrder = input.order().toLowerCase();
        while(!drinkOrder.equals("americano") && !drinkOrder.equals("latte") && !drinkOrder.equals("coffee")){
            printer.println("I'm sorry, you entered an incorrect drink.");
            printer.println("What kind of drink would you like? We have an Americano, a latte or a coffee");
            input = new ConsoleOrderInput();
            drinkOrder = input.order();
        }
        
        Coffee drink;
        switch (drinkOrder) {
            case "americano":
                drink = new Americano();
                break;
            case "latte":
                drink = new Latte();
                break;
            default:
                drink = new BlackCoffee();
                break;
        }
        
        //create order
        Order order = new Order(drinkOrder, input, drink, printer);
        printer.println(order.makeDrink());
        
    }
    
}
