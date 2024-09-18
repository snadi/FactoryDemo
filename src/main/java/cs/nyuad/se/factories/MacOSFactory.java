package cs.nyuad.se.factories;

import cs.nyuad.se.buttons.*;
import cs.nyuad.se.checkboxes.*;

public class MacOSFactory implements GUIFactory {

    private static GUIFactory factory;

    private MacOSFactory(){
    }
    
    public static GUIFactory getInstance(){
        if(factory == null){
            factory = new MacOSFactory();
        }
        return factory;
    }

    public Button createButton(){
        return new MacOSButton();
    }

    public CheckBox createCheckBox(){
        return new MacOSCheckBox();
    }
}