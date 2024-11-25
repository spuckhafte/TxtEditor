package helpers.components.TopMenu;

import helpers.components.GuiFrame;

import javax.swing.*;

public class GuiMenuBar extends JMenuBar {
    GuiMenu[] menuItems = {
            new GuiMenu("File", 'F'),
            new GuiMenu("Edit", 'E'),
    };

    public GuiMenuBar(GuiFrame frame) {
        super();
        frame.setJMenuBar(this);
        this.setVisible(true);

        for (GuiMenu aMenu : menuItems) {
            aMenu.attachToMenuBar(this);
        }
    }
}