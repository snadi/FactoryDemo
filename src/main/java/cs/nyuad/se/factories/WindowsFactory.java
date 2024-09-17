package cs.nyuad.se.factories;

import cs.nyuad.se.buttons.*;
import cs.nyuad.se.checkboxes.*;

public class WindowsFactory implements GUIFactory {
    
    public Button createButton(){
        return new WindowsButton();
    }

    public CheckBox createCheckBox(){
        return new WindowsCheckBox();
    }
}