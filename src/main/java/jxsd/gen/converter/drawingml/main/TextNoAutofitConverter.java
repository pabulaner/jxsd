package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextNoAutofitModel;
import org.docx4j.dml.CTTextNoAutofit;

/**
 * This is a generated sequence class.
 */
public class TextNoAutofitConverter {
  private TextNoAutofitConverter() {
  }

  public static TextNoAutofitModel fromDocx4j(CTTextNoAutofit value) {
    if (value == null) return null;
    return new TextNoAutofitModel();
  }

  public static CTTextNoAutofit toDocx4j(TextNoAutofitModel value) {
    if (value == null) return null;
    CTTextNoAutofit result = new CTTextNoAutofit();
    return result;
  }
}
