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
public class Latte implements Coffee, Size, Espresso, Milk, Flavor, Caffeine {
    private String size;
    
    //access input and printer
    Input input = new ConsoleOrderInput();
    Printer printer = new ConsolePrinter();
    
    @Override
    public String makeDrink() {
        size = size();
        String caffeine = regularOrDecaf();
        String numShots = addEspressoShot();
        String milk = typeOfMilk();
        String flavor = addFlavor();
        String order = size + caffeine + numShots + " shot " + milk + flavor;
        return order;
    }

    @Override
    public String addEspressoShot() {
        String shots;
        //find shot amount
        switch (size) {
            case "small": return shots = "single";
            case "medium": return shots = "double";
            default: return shots = "double";
        }
    }

    @Override
    public String typeOfMilk() {
         //ask what kind of milk
        printer.println("Please choose your milk: Skim, 2 percent, whole or soy?");
        //assign to string
        String milk = input.order();
        //check
        while (!(milk.equals("skim")) && !(milk.equals("2 percent")) && !(milk.equals("two percent")) && !(milk.equals("whole")) && !(milk.equals("soy"))) {
            printer.println("Sorry we do not have that, please enter Skim, 2 percent, whole or soy");
            milk = input.order();
        }
        return milk + " ";
    }

    @Override
    public String addFlavor() {
        //ask flavor
        printer.println("What flavor would you like to add?");
        printer.println("Caramel, Vanilla, Mocha, White Chocolate or none?");
        String flavor = input.order();
        //check
        while(!flavor.equals("caramel") && !flavor.equals("vanilla") && !flavor.equals("mocha") && !flavor.equals("white chocolate") && !flavor.equals("none")){
            printer.println("incorrect flavor entered");
            printer.println("Caramel, Vanilla, Mocha, White Chocolate or none?");
            flavor = input.order();
        }
        if(flavor.equals("none")){
            return "";
        }
        return flavor;
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
