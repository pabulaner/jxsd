package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextUnderlineLineFollowTextModel;
import org.docx4j.dml.CTTextUnderlineLineFollowText;

/**
 * This is a generated sequence class.
 */
public class TextUnderlineLineFollowTextConverter {
  private TextUnderlineLineFollowTextConverter() {
  }

  public static TextUnderlineLineFollowTextModel fromDocx4j(CTTextUnderlineLineFollowText value) {
    if (value == null) return null;
    return new TextUnderlineLineFollowTextModel();
  }

  public static CTTextUnderlineLineFollowText toDocx4j(TextUnderlineLineFollowTextModel value) {
    if (value == null) return null;
    CTTextUnderlineLineFollowText result = new CTTextUnderlineLineFollowText();
    return result;
  }
}
