package helpers.utils;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton  {
    static final int STD_WIDTH = 50;
    static final int STD_HEIGHT = 30;
    
    public MyButton(String text) {
        super(text);
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setFocusPainted(false);
    }

    public MyButton(MyImage img) {
        super(img.scale(STD_WIDTH - 20, STD_HEIGHT));
    }

    public void setStdButtonStyle() {
        this.setPreferredSize(new Dimension(STD_WIDTH, STD_HEIGHT));

        if (this.getText().isEmpty())
            return;

        char buttonType = this.getText().charAt(0);
        Font customFont = new Font("Arial", Font.PLAIN, 18);

        if (buttonType == 'B')
            customFont = MyFont.getBold(customFont);
        else if (buttonType == 'I')
            customFont = MyFont.getBoldItalic(customFont);
        else {
            if (buttonType == 'U') {
                customFont = MyFont.getBoldUnderline(customFont);
            } else if (buttonType == 'S') {
                customFont = MyFont.getBoldStrike(customFont);
            }
        }

        this.setFont(customFont);
    }
}
