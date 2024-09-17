package cs.nyuad.se.factories;

import cs.nyuad.se.buttons.*;
import cs.nyuad.se.checkboxes.*;

public class MacOSFactory implements GUIFactory {
    
    public Button createButton(){
        return new MacOSButton();
    }

    public CheckBox createCheckBox(){
        return new MacOSCheckBox();
    }
}