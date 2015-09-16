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
public class BlackCoffee implements Coffee, Size, Creamer, Milk, Caffeine {
    private String size;
    
    //access input and printer
    Input input = new ConsoleOrderInput();
    Printer printer = new ConsolePrinter();
    
    @Override
    public String makeDrink() {
        //how to make the drink
        //find size, if reg or decaf, if cream
        //and what kind, Add order together to return
        //order so that it spits out what the order is
        size = size();
        String creamer = addCream();
        String caffeinated = regularOrDecaf();
        String order = size + caffeinated + creamer;
        return order;
    }

    @Override
    public String addCream() {
         //ask for cream
        printer.println("Would you like room for cream?");
        //assign to string
        String cream = input.order();
        String milk;
        //check
        while (!(cream.equals("yes")) && !(cream.equals("no"))) {
            printer.println("Please enter yes or no");
            printer.println("Would you like room for cream?");
            cream = input.order();
        }
        //do something
        if (cream.equals("yes")) {
            milk = typeOfMilk();
            return "with a " + milk;
        }else{
            return "";
        }
    }

    @Override
    public String typeOfMilk() {
        //ask what kind of milk
        printer.println("Please choose your milk: Skim or creamer");
        //assign to string
        String milk = input.order();
        //check
        while (!(milk.equals("skim")) && !(milk.equals("creamer"))) {
            printer.println("Sorry we do not have that, please enter Skim or Creamer");
            milk = input.order();
        }
        if(milk.equals("skim")){
            milk = "a skim topper";
        }else{
            milk = "cream";
        }
        return milk;
    }

    @Override
    public String size() {
        // ask for size
        printer.println("What size? small, medium or large?");
        //assign to string
        String cupSize = input.order();
        //check
        while(!(cupSize.equals("small")) && !(cupSize.equals("medium")) && !(cupSize.equals("large"))){
            printer.println("Incorrect size, please enter: small, medium or large");
            cupSize = input.order();
        }
        return cupSize;
    }

    @Override
    public String regularOrDecaf() {
        //ask for regular or decaf
        printer.println("Regular or Decaf?");
        //assign to string
        String type = input.order();
        //check
        while(!(type.equals("regular")) && !(type.equals("decaf"))){
            printer.println("incorrect entry, please enter: regular or decaf");
            type = input.order();
        }
        return " " + type + " ";
    }

  
    

    
    
}
