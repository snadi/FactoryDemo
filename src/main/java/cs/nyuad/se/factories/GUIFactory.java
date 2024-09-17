package cs.nyuad.se.factories;

import cs.nyuad.se.buttons.Button;
import cs.nyuad.se.checkboxes.*;

public interface GUIFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
