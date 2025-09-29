package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextBlipBulletModel;
import org.docx4j.dml.CTTextBlipBullet;

/**
 * This is a generated sequence class.
 */
public class TextBlipBulletConverter {
  private TextBlipBulletConverter() {
  }

  public static TextBlipBulletModel fromDocx4j(CTTextBlipBullet value) {
    if (value == null) return null;
    return new TextBlipBulletModel(BlipConverter.fromDocx4j(value.getBlip()));
  }

  public static CTTextBlipBullet toDocx4j(TextBlipBulletModel value) {
    if (value == null) return null;
    CTTextBlipBullet result = new CTTextBlipBullet();
    result.setBlip(BlipConverter.toDocx4j(value.getBlip()));
    return result;
  }
}
