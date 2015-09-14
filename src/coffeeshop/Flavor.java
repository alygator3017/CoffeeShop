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
public abstract class Flavor {
    
    
    public String addFlavor() {
        //ask flavor
        System.out.println("What flavor would you like to add?");
        System.out.println("Caramel, Vanilla, Mocha, White Chocolate or none?");
        Scanner input = new Scanner (System.in);
        String flavor = input.nextLine();
        //check
        while(!flavor.equals("caramel") && !flavor.equals("vanilla") && !flavor.equals("mocha") && !flavor.equals("white chocolate") && !flavor.equals("none")){
            System.out.println("incorrect flavor entered");
            System.out.println("Caramel, Vanilla, Mocha, White Chocolate or none?");
            flavor = input.nextLine();
        }
        if(flavor.equals("none")){
            flavor = "";
        }
        return " " + flavor + " ";
    }
}
