/**
 * Example based on https://refactoring.guru/design-patterns/abstract-factory/java/example#lang-features 
 * Solution code based on same link.
 */
package cs.nyuad.se.factorydemo;

import cs.nyuad.se.factories.GUIFactory;
import cs.nyuad.se.factories.MacOSFactory;
import cs.nyuad.se.factories.WindowsFactory;
import cs.nyuad.se.app.*;


public class Main {

    private static Application configureApp(){
        System.out.println("Which OS do you want to support? Mac or Windows");
        String os = System.console().readLine();
        GUIFactory gui = null;

        if (os.equals("Mac")){
            gui = new MacOSFactory();
        }else if (os.equals("Windows")){
            gui = new WindowsFactory();
        }else{
            System.out.println("Invalid OS");
        }

        Application app = new Application(gui);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApp();
        app.paint();
    }
}
