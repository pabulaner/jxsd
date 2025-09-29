package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextBulletTypefaceFollowTextModel;
import org.docx4j.dml.CTTextBulletTypefaceFollowText;

/**
 * This is a generated sequence class.
 */
public class TextBulletTypefaceFollowTextConverter {
  private TextBulletTypefaceFollowTextConverter() {
  }

  public static TextBulletTypefaceFollowTextModel fromDocx4j(CTTextBulletTypefaceFollowText value) {
    if (value == null) return null;
    return new TextBulletTypefaceFollowTextModel();
  }

  public static CTTextBulletTypefaceFollowText toDocx4j(TextBulletTypefaceFollowTextModel value) {
    if (value == null) return null;
    CTTextBulletTypefaceFollowText result = new CTTextBulletTypefaceFollowText();
    return result;
  }
}
