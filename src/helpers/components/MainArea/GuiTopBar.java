package helpers.components.MainArea;

import helpers.utils.MyButton;
import helpers.utils.MyImage;

import javax.swing.*;
import java.awt.*;

public class GuiTopBar extends JPanel {
    MyButton[] buttonGroup1 = {
            new MyButton("B"),
            new MyButton("I"),
            new MyButton("S"),
            new MyButton("U"),
    };

    MyButton[] buttonGroup2 = {
            new MyButton(new MyImage("left_align.png")),
            new MyButton(new MyImage("center_align.png")),
            new MyButton(new MyImage("right_align.png")),
    };

    public GuiTopBar(GuiMain mainArea) {
        super();

        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 10));
        //this.setBackground(Color.WHITE);

        JPanel formatTextGroup = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        for (MyButton btn : buttonGroup1) {
            btn.setStyleToFormattingButton();
            formatTextGroup.add(btn);
        }
        formatTextGroup.add(Box.createRigidArea(new Dimension(8, 0)));
        for (MyButton btn : buttonGroup2) {
            btn.setStyleToFormattingButton();
            formatTextGroup.add(btn);
        }

        this.add(formatTextGroup);

        this.add(Box.createHorizontalGlue());

        mainArea.add(this);
    }
}