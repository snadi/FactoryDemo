/**
 * Example based on https://refactoring.guru/design-patterns/abstract-factory/java/example#lang-features 
 * Solution code based on same link.
 */

package cs.nyuad.se.buttons;

public class WindowsButton implements Button{
    public void paint(){
        System.out.println("Painting a MacOS Button");

    }
}
