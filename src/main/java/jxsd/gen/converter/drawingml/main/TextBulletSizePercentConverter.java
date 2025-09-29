package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextBulletSizePercentModel;
import org.docx4j.dml.CTTextBulletSizePercent;

/**
 * This is a generated sequence class.
 */
public class TextBulletSizePercentConverter {
  private TextBulletSizePercentConverter() {
  }

  public static TextBulletSizePercentModel fromDocx4j(CTTextBulletSizePercent value) {
    if (value == null) return null;
    return new TextBulletSizePercentModel(TextBulletSizePercentValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTTextBulletSizePercent toDocx4j(TextBulletSizePercentModel value) {
    if (value == null) return null;
    CTTextBulletSizePercent result = new CTTextBulletSizePercent();
    result.setVal(TextBulletSizePercentValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
