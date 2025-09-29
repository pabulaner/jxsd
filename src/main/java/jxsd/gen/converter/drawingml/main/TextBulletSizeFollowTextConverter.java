package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextBulletSizeFollowTextModel;
import org.docx4j.dml.CTTextBulletSizeFollowText;

/**
 * This is a generated sequence class.
 */
public class TextBulletSizeFollowTextConverter {
  private TextBulletSizeFollowTextConverter() {
  }

  public static TextBulletSizeFollowTextModel fromDocx4j(CTTextBulletSizeFollowText value) {
    if (value == null) return null;
    return new TextBulletSizeFollowTextModel();
  }

  public static CTTextBulletSizeFollowText toDocx4j(TextBulletSizeFollowTextModel value) {
    if (value == null) return null;
    CTTextBulletSizeFollowText result = new CTTextBulletSizeFollowText();
    return result;
  }
}
