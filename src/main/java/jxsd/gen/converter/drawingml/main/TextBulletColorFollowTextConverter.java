package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextBulletColorFollowTextModel;
import org.docx4j.dml.CTTextBulletColorFollowText;

/**
 * This is a generated sequence class.
 */
public class TextBulletColorFollowTextConverter {
  private TextBulletColorFollowTextConverter() {
  }

  public static TextBulletColorFollowTextModel fromDocx4j(CTTextBulletColorFollowText value) {
    if (value == null) return null;
    return new TextBulletColorFollowTextModel();
  }

  public static CTTextBulletColorFollowText toDocx4j(TextBulletColorFollowTextModel value) {
    if (value == null) return null;
    CTTextBulletColorFollowText result = new CTTextBulletColorFollowText();
    return result;
  }
}
