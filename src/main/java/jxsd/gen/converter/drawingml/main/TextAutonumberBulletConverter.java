package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextAutonumberBulletModel;
import org.docx4j.dml.CTTextAutonumberBullet;

/**
 * This is a generated sequence class.
 */
public class TextAutonumberBulletConverter {
  private TextAutonumberBulletConverter() {
  }

  public static TextAutonumberBulletModel fromDocx4j(CTTextAutonumberBullet value) {
    if (value == null) return null;
    return new TextAutonumberBulletModel(TextAutonumberSchemeValueConverter.fromDocx4j(value.getType()), TextBulletStartAtNumValueConverter.fromDocx4j(value.getStartAt()));
  }

  public static CTTextAutonumberBullet toDocx4j(TextAutonumberBulletModel value) {
    if (value == null) return null;
    CTTextAutonumberBullet result = new CTTextAutonumberBullet();
    result.setType(TextAutonumberSchemeValueConverter.toDocx4j(value.getType()));
    result.setStartAt(TextBulletStartAtNumValueConverter.toDocx4j(value.getStartAt()));
    return result;
  }
}
