/**
 * Example based on https://refactoring.guru/design-patterns/abstract-factory/java/example#lang-features 
 * Solution code based on same link.
 */
package cs.nyuad.se.factorydemo;

import cs.nyuad.se.buttons.Button;
import cs.nyuad.se.buttons.MacOSButton;
import cs.nyuad.se.checkboxes.MacOSCheckBox;
import cs.nyuad.se.buttons.WindowsButton;
import cs.nyuad.se.checkboxes.WindowsCheckBox;


public class Main {
    public static void main(String[] args) {
        System.out.println("Which OS do you want to support? Mac or Windows");
        String os = System.console().readLine();

        if (os.equals("Mac")){
            Button button = new MacOSButton();
            button.paint();
            MacOSCheckBox checkBox = new MacOSCheckBox();
            checkBox.renderMacOSCheckBox();
        }else if (os.equals("Windows")){
            Button button = new WindowsButton();
            button.paint();
            WindowsCheckBox checkBox = new WindowsCheckBox();
            checkBox.renderWindowsCheckBox();
        }else{
            System.out.println("Invalid OS");
        }
           

    }
}
