package helpers.utils;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyFont {
    public static final String DEFAULT_FONT_STYLE = "Serif plain";
    public static final int DEFAULT_FONT_SIZE = 14;

    public static Font getBold(Font font) {
        return font.deriveFont(Font.BOLD);
    }

    public static Font getItalic(Font font) {
        return font.deriveFont(Font.ITALIC);
    }

    public static Font getBoldItalic(Font font) {
        return font.deriveFont(Font.BOLD | Font.ITALIC);
    }

    public static Font getStrike(Font font) {
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
        return font.deriveFont(attributes);
    }

    public static Font getBoldStrike(Font font) {
        return getBold(getStrike(font));
    }

    public static Font getUnderline(Font font) {
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        return font.deriveFont(attributes);
    }

    public static Font getBoldUnderline(Font font) {
        return getBold(getUnderline(font));
    }

    public static String[] getAllFonts() {
        var fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();

        return Arrays.stream(fonts)
                .map(item -> item.getFontName().replace('.', ' '))
                .toArray(String[]::new);
    }
}
