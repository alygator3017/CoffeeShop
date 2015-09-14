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
public class Americano implements Coffee, Size, Espresso, Creamer, Milk, Flavor, Caffeine {
    private String size;
    //access input and printer
    Input input = new ConsoleOrderInput();
    Printer printer = new ConsolePrinter();
    

    @Override
    public String makeDrink() {
        size = size();
        String caffeine = regularOrDecaf();
        String numShots = addEspressoShot();
        String creamer = addCream();
        String flavor = addFlavor();
        String order = size + caffeine + numShots + " shot" + creamer + " " + flavor;
        return order;
    }

    @Override
    public String addEspressoShot() {
        String shots;
        //find shot amount
        switch (size) {
            case "small": return shots = "double";
            case "medium": return shots = "triple";
            default: return shots = "four";
        }
        
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
            return " with " + milk;
        }else{
            return " " + cream + " creamer";
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
            flavor = "";
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
        return cupSize + " ";
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
