package cs.nyuad.se.factories;

import cs.nyuad.se.buttons.*;
import cs.nyuad.se.checkboxes.*;

public class WindowsFactory implements GUIFactory {

    private static GUIFactory factory;

    private WindowsFactory(){
    }

    public static GUIFactory getInstance(){
        if(factory == null){
            factory = new WindowsFactory();
        }
        return factory;
    }
    
    public Button createButton(){
        return new WindowsButton();
    }

    public CheckBox createCheckBox(){
        return new WindowsCheckBox();
    }
}