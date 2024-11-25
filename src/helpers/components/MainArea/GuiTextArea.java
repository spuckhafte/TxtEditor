package helpers.components.MainArea;

import javax.swing.*;
import java.awt.*;

public class GuiTextArea extends JTextArea {
    public GuiTextArea(GuiMain mainArea) {
        super();
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setMargin(new Insets(10, 10, 10, 10));

        this.setFont(new Font("Serif", Font.PLAIN, 16));

        mainArea.add(this);
    }
}
