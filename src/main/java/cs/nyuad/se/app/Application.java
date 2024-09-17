package cs.nyuad.se.app;

import cs.nyuad.se.buttons.Button;
import cs.nyuad.se.factories.GUIFactory;
import cs.nyuad.se.checkboxes.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.render();
    }
}
