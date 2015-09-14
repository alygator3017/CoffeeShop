package coffeeshop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alyson
 */
public interface MakeCoffee {
    public abstract void getSize();
    public abstract void GrindBeans();
    public abstract void brew();
    public abstract void useMilk(String Type);
}
