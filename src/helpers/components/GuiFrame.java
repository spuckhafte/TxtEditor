package helpers.components;

import helpers.utils.MyScreen;

import javax.swing.*;

public class GuiFrame extends JFrame {
    public GuiFrame(String title, int width, int height) {
        super(title);

        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyScreen.setWindowLocationOnScreen(this);
    }
}
