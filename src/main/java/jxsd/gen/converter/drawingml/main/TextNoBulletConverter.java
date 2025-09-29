package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextNoBulletModel;
import org.docx4j.dml.CTTextNoBullet;

/**
 * This is a generated sequence class.
 */
public class TextNoBulletConverter {
  private TextNoBulletConverter() {
  }

  public static TextNoBulletModel fromDocx4j(CTTextNoBullet value) {
    if (value == null) return null;
    return new TextNoBulletModel();
  }

  public static CTTextNoBullet toDocx4j(TextNoBulletModel value) {
    if (value == null) return null;
    CTTextNoBullet result = new CTTextNoBullet();
    return result;
  }
}
