package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.model.drawingml.main.TextCharBulletModel;
import org.docx4j.dml.CTTextCharBullet;

/**
 * This is a generated sequence class.
 */
public class TextCharBulletConverter {
  private TextCharBulletConverter() {
  }

  public static TextCharBulletModel fromDocx4j(CTTextCharBullet value) {
    if (value == null) return null;
    return new TextCharBulletModel(StringValueConverter.fromDocx4j(value.getChar()));
  }

  public static CTTextCharBullet toDocx4j(TextCharBulletModel value) {
    if (value == null) return null;
    CTTextCharBullet result = new CTTextCharBullet();
    result.setChar(StringValueConverter.toDocx4j(value.getChar()));
    return result;
  }
}
