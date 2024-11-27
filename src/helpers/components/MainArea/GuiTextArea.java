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

        MyChanges.<String[]>listen("textAreaFont", updatedFont -> {
            String fontName = updatedFont[0].isEmpty()
                    ? this.getFont().getFontName()
                    : updatedFont[0];

            int fontSize = updatedFont[1].isEmpty()
                    ? this.getFont().getSize()
                    : Integer.parseInt(updatedFont[1]);

            System.out.println(fontSize + " " + updatedFont[1]);

            this.setFont(new Font(fontName, Font.PLAIN, fontSize));
            return 0;
        });

        MyChanges.<String>listen("textAreaAlignment", updatedAlignment -> {
            if (updatedAlignment.equals("left-align"))
                this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            if (updatedAlignment.equals("right-align"))
                this.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

            return 0;
        });

        mainArea.add(this);
    }
}
