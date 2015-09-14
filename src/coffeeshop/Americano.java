/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeshop;

import java.util.Scanner;

/**
 *
 * @author Alyson
 */
public class Americano implements Coffee, Espresso, Creamer, Milk, Flavor {

    @Override
    public void makeDrink() {
        System.out.println("In Americano make drink");
    }

    @Override
    public void addEspressoShot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCream() {
//        System.out.println("Would you like room for cream?");
//        Scanner keyboard = new Scanner(System.in);
//
//        String cream = keyboard.nextLine().toLowerCase();
//        while (!(cream.equals("yes")) && !(cream.equals("no"))) {
//            System.out.println("Please enter yes or no");
//            System.out.println("Would you like room for cream?");
//            cream = keyboard.nextLine().toLowerCase();
//        }
//
//        if (cream.equals("yes")) {
//            typeOfMilk();
//        }
    }

    @Override
    public void typeOfMilk() {
        System.out.println("Please choose your milk");
    }

    @Override
    public void addFlavor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
