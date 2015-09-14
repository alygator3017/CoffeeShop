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
public class Americano implements Coffee{

    @Override
    public void makeDrink() {
        System.out.println("Would you like room for cream?");
        Scanner keyboard = new Scanner(System.in);
        
        String cream = keyboard.nextLine().toLowerCase();
        while(!(cream.equals("yes")) && !(cream.equals("no"))){
            System.out.println("Please enter yes or no");
            System.out.println("Would you like room for cream?");
            cream = keyboard.nextLine().toLowerCase();
        }
        
        if(cream.equals("yes")){
            
        }else{
            
        }
    }

    
    
}
