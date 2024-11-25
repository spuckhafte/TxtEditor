package helpers.components.TopMenu;

import javax.swing.*;

public class GuiMenu extends JMenu{
    public GuiMenu(String name, char mnemonic) {
        super(name);
        this.setMnemonic(mnemonic);
    }

    public void attachToMenuBar(JMenuBar menuBar) {
        menuBar.add(this);
    }
}
