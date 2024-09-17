/**
 * Example based on https://refactoring.guru/design-patterns/abstract-factory/java/example#lang-features 
 * Solution code based on same link.
 */

package cs.nyuad.se.checkboxes;

public class MacOSCheckBox implements CheckBox{
    public void render(){
        System.out.println("Rendering a MacOS CheckBox");
    }
    
}
