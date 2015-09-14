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
public class Americano implements Coffee, Size, Espresso, Creamer, Milk, Flavor {
    private String size;
//    //access input and printer
    Input input = new ConsoleOrderInput();
    Printer printer = new ConsolePrinter();
    

    @Override
    public void makeDrink() {
        size = size();
        String numShots = addEspressoShot();
        String creamer = addCream();
        String flavor = addFlavor();
        
    }

    @Override
    public String addEspressoShot() {
        String shots;
        //find shot amount
        switch (size) {
            case "small": return shots = "2";
            case "medium": return shots = "3";
            default: return shots = "4";
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
            return cream + " creamer";
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
        return milk;
    }

    @Override
    public String addFlavor() {
        return null;
    }


    @Override
    public String size() {
        // ask for size
        printer.println("What size? small, medium or large?");
        //assign to string
        String size = input.order();
        //check
        while(!(size.equals("small")) && !(size.equals("medium")) && !(size.equals("large"))){
            printer.println("Incorrect size, please enter: small, medium or large");
            size = input.order();
        }
        return size;
    }

}
