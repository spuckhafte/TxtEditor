package helpers.utils;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MyImage extends ImageIcon {
    public MyImage(String path) {
        super(Objects.requireNonNull(MyImage.class.getResource("/resources/images/" + path)));
    }

    public ImageIcon scale(int w, int h) {
        Image scaledImage = this.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}
