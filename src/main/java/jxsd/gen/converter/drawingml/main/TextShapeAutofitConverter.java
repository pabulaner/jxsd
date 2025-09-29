package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextShapeAutofitModel;
import org.docx4j.dml.CTTextShapeAutofit;

/**
 * This is a generated sequence class.
 */
public class TextShapeAutofitConverter {
  private TextShapeAutofitConverter() {
  }

  public static TextShapeAutofitModel fromDocx4j(CTTextShapeAutofit value) {
    if (value == null) return null;
    return new TextShapeAutofitModel();
  }

  public static CTTextShapeAutofit toDocx4j(TextShapeAutofitModel value) {
    if (value == null) return null;
    CTTextShapeAutofit result = new CTTextShapeAutofit();
    return result;
  }
}
