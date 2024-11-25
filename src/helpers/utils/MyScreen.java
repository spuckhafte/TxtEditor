package helpers.utils;

import javax.swing.*;
import java.awt.*;

public class MyScreen {
    public static int[] getDimensions() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        return new int[]{ screenSize.width, screenSize.height };
    }

    public static void setWindowLocationOnScreen(JFrame frame) {
        int[] dimensions = MyScreen.getDimensions();
        frame.setLocation(
                dimensions[0] / 2 - (frame.getWidth() / 2),
                dimensions[1] / 2 - (frame.getHeight() / 2)
        );
    }
}
