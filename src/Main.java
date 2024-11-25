import helpers.components.GuiFrame;
import helpers.components.MainArea.GuiMain;
import helpers.components.TopMenu.GuiMenuBar;

public class Main {
    public static void main(String[] args) {
        GuiFrame frame = new GuiFrame(
                "Txt Editor",
                1200, 700
        );

        new GuiMenuBar(frame);
        new GuiMain(frame);

        frame.setVisible(true);
    }
}