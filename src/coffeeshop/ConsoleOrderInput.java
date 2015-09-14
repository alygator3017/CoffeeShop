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
public class ConsoleOrderInput implements Input {

    @Override
    public String order() {
//        //ask for order
//        System.out.println("What kind of drink would you like? We have an Americano, a latte or a Black coffee");
        //scanner keyboard
        Scanner keyboard = new Scanner(System.in);
        String drink = keyboard.nextLine().toLowerCase();
        //check
//        while(!(drink.equals("americano"))&& !(drink.equals("latte")) && !(drink.equals("black coffee"))){
//            System.out.println("I'm sorry, you entered an incorrect drink.");
//            System.out.println("What kind of drink would you like? We have an Americano, a latte or a Black coffee");
//            drink = keyboard.nextLine().toLowerCase();
//        }
        //return keyboard string
        return drink;
        

    }

}
