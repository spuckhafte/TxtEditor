package helpers.components.MainArea;

import helpers.components.GuiFrame;

import javax.swing.*;

public class GuiMain extends JPanel {
    public GuiMain(GuiFrame frame) {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        new GuiTopBar(this);
        new GuiTextArea(this);

        frame.add(this);
    }
}
