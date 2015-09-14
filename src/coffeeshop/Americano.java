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
    
    //access input
    Input input = new ConsoleOrderInput();

    @Override
    public void makeDrink() {
        String size = size();
        String numShots = addEspressoShot();
        String creamer = addCream();
        String flavor = addFlavor();
        
    }

    @Override
    public String addEspressoShot() {
        
    }

    @Override
    public String addCream() {
        //ask for cream
        System.out.println("Would you like room for cream?");
        //assign to string
        String cream = input.order();
        String milk;
        //check
        while (!(cream.equals("yes")) && !(cream.equals("no"))) {
            System.out.println("Please enter yes or no");
            System.out.println("Would you like room for cream?");
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
        System.out.println("Please choose your milk: Skim or creamer");
        //assign to string
        String milk = input.order();
        //check
        while (!(milk.equals("skim")) && !(milk.equals("creamer"))) {
            System.out.println("Sorry we do not have that, please enter Skim or Creamer");
            milk = input.order();
        }
        return milk;
    }

    @Override
    public String addFlavor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String size() {
        // ask for size
        System.out.println("What size? small, medium or large?");
        //assign to string
        String size = input.order();
        //check
        while(!())
    }

}
