package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextUnderlineFillFollowTextModel;
import org.docx4j.dml.CTTextUnderlineFillFollowText;

/**
 * This is a generated sequence class.
 */
public class TextUnderlineFillFollowTextConverter {
  private TextUnderlineFillFollowTextConverter() {
  }

  public static TextUnderlineFillFollowTextModel fromDocx4j(CTTextUnderlineFillFollowText value) {
    if (value == null) return null;
    return new TextUnderlineFillFollowTextModel();
  }

  public static CTTextUnderlineFillFollowText toDocx4j(TextUnderlineFillFollowTextModel value) {
    if (value == null) return null;
    CTTextUnderlineFillFollowText result = new CTTextUnderlineFillFollowText();
    return result;
  }
}
