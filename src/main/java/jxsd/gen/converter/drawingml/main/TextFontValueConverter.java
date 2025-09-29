package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.ByteValueConverter;
import jxsd.gen.model.drawingml.main.TextFontValueModel;
import org.docx4j.dml.TextFont;

/**
 * This is a generated sequence class.
 */
public class TextFontValueConverter {
  private TextFontValueConverter() {
  }

  public static TextFontValueModel fromDocx4j(TextFont value) {
    if (value == null) return null;
    return new TextFontValueModel(ByteValueConverter.fromDocx4j(value.getCharset()), Typeface.fromDocx4j(value.getTypeface()), Panose.fromDocx4j(value.getPanose()), ByteValueConverter.fromDocx4j(value.getPitchFamily()));
  }

  public static TextFont toDocx4j(TextFontValueModel value) {
    if (value == null) return null;
    TextFont result = new TextFont();
    result.setCharset(ByteValueConverter.toDocx4j(value.getCharset()));
    result.setTypeface(Typeface.toDocx4j(value.getTypeface()));
    result.setPanose(Panose.toDocx4j(value.getPanose()));
    result.setPitchFamily(ByteValueConverter.toDocx4j(value.getPitchFamily()));
    return result;
  }

  /**
   * This is a generated restriction class.
   */
  public static class Typeface {
    private Typeface() {
    }

    public static String fromDocx4j(String value) {
      if (value == null) return null;
      return value;
    }

    public static String toDocx4j(String value) {
      if (value == null) return null;
      return value;
    }
  }

  /**
   * This is a generated restriction class.
   */
  public static class Panose {
    private Panose() {
    }

    public static String fromDocx4j(String value) {
      if (value == null) return null;
      return value;
    }

    public static String toDocx4j(String value) {
      if (value == null) return null;
      return value;
    }
  }
}
