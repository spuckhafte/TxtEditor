package helpers.components.MainArea;

import helpers.utils.MyChanges;
import helpers.utils.MyFont;

import javax.swing.*;
import java.awt.*;

public class GuiTextArea extends JTextArea {
    public GuiTextArea(GuiMain mainArea) {
        super();
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setMargin(new Insets(5, 5, 5, 5));

        this.setFont(new Font(
                MyFont.DEFAULT_FONT_STYLE,
                Font.PLAIN,
                MyFont.DEFAULT_FONT_SIZE
        ));

        MyChanges.<Font>listenToChange("textAreaFont", updatedFont -> {
            String fontName = this.getFont().getFontName();
            int fontSize = this.getFont().getSize();

            if (!updatedFont.getFontName().isEmpty())
                fontName = updatedFont.getFontName();
            if (updatedFont.getSize() != -1)
                fontSize = updatedFont.getSize();

            this.setFont(new Font(fontName, this.getFont().getStyle(), fontSize));

            return 0;
        });

        mainArea.add(this);
    }
}
