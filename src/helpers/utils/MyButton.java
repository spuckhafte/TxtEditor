package helpers.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

public class MyButton extends JButton  {
    static final int STD_WIDTH = 50;
    static final int STD_HEIGHT = 30;
    
    public MyButton(String text) {
        super(text);
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setFocusPainted(false);
    }

    public MyButton(MyImage img) {
        super(img.scale(STD_WIDTH, STD_HEIGHT));
    }

    public void setStdButtonStyle() {
        this.setPreferredSize(new Dimension(STD_WIDTH, STD_HEIGHT));

        if (this.getText().isEmpty())
            return;

        char buttonType = this.getText().charAt(0);
        Font customFont = new Font("Arial", Font.PLAIN, 18);

        if (buttonType == 'B')
            customFont = customFont.deriveFont(Font.BOLD);
        else if (buttonType == 'I')
            customFont = customFont.deriveFont(Font.BOLD | Font.ITALIC);
        else {
            if (buttonType == 'U') {
                Map<TextAttribute, Object> attributes = new HashMap<>(customFont.getAttributes());
                attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                customFont = customFont.deriveFont(attributes);
                customFont = customFont.deriveFont(Font.BOLD);

            } else if (buttonType == 'S') {
                Map<TextAttribute, Object> attributes = new HashMap<>(customFont.getAttributes());
                attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
                customFont = customFont.deriveFont(attributes);
                customFont = customFont.deriveFont(Font.BOLD);
            }
        }

        this.setFont(customFont);
    }
}
