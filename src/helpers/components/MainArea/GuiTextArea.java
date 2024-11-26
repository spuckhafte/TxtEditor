package helpers.components.MainArea;

import helpers.utils.MyFont;

import javax.swing.*;
import java.awt.*;

public class GuiTextArea extends JTextArea {
    public GuiTextArea(GuiMain mainArea) {
        super();
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setMargin(new Insets(5, 5, 5, 5));

        this.setFont(new Font(MyFont.DEFAULT_FONT_STYLE, Font.PLAIN, MyFont.DEFAULT_FONT_SIZE));
        mainArea.add(this);
    }
}
