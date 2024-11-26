package helpers.components.MainArea;

import helpers.utils.MyButton;
import helpers.utils.MyFont;
import helpers.utils.MyImage;

import javax.swing.*;
import java.awt.*;
import java.util.stream.IntStream;

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

    String[] availableFonts = MyFont.getAllFonts();

    public GuiTopBar(GuiMain mainArea) {
        super();

        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
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

        JComboBox<String> fontStyleSelector = new JComboBox<>(availableFonts);
        fontStyleSelector.setSelectedItem(MyFont.DEFAULT_FONT_STYLE);
        fontStyleSelector.setPreferredSize(new Dimension(fontStyleSelector.getPreferredSize().width, 30));
        fontStyleSelector.setFont(new Font("Serif bold", Font.BOLD, MyFont.DEFAULT_FONT_SIZE));
        this.add(fontStyleSelector);

        JComboBox<Integer> fontSizeSelector = new JComboBox<>(
                IntStream.rangeClosed(4, 50).boxed().toArray(Integer[]::new)
        );
        fontSizeSelector.setSelectedItem(MyFont.DEFAULT_FONT_SIZE);
        fontSizeSelector.setPreferredSize(new Dimension(fontSizeSelector.getPreferredSize().width + 5, 30));
        fontSizeSelector.setFont(new Font("Serif bold", Font.BOLD, MyFont.DEFAULT_FONT_SIZE));
        this.add(fontSizeSelector);

        mainArea.add(this);
    }
}