/**
 * Example based on https://refactoring.guru/design-patterns/abstract-factory/java/example#lang-features 
 * Solution code based on same link.
 */
package cs.nyuad.se.factorydemo;


public class Main {
    public static void main(String[] args) {
        System.out.println("Which OS do you want to support? Mac or Windows");
        String os = System.console().readLine();
        GUI gui = null;

        if (os.equals("Mac")){
            gui = new MacOSGUI();
        }else if (os.equals("Windows")){
            gui = new WindowsGUI();
        }else{
            System.out.println("Invalid OS");
        }
           
    gui.renderGUI();

    }
}
