/*
console printer class using printer interface
 */
package coffeeshop;

/**
 *
 * @author Alyson
 */
public class ConsolePrinter implements Printer{

    @Override
    public void println(String line) {
        System.out.println(line);
    }
    
}
