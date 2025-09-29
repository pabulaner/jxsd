package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextBulletSizePointModel;
import org.docx4j.dml.CTTextBulletSizePoint;

/**
 * This is a generated sequence class.
 */
public class TextBulletSizePointConverter {
  private TextBulletSizePointConverter() {
  }

  public static TextBulletSizePointModel fromDocx4j(CTTextBulletSizePoint value) {
    if (value == null) return null;
    return new TextBulletSizePointModel(TextFontSizeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTTextBulletSizePoint toDocx4j(TextBulletSizePointModel value) {
    if (value == null) return null;
    CTTextBulletSizePoint result = new CTTextBulletSizePoint();
    result.setVal(TextFontSizeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
