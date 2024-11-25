package helpers.utils;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

public class MyFont {
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
}
