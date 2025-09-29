package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.EmptyElementModel;
import org.docx4j.dml.CTEmptyElement;

/**
 * This is a generated sequence class.
 */
public class EmptyElementConverter {
  private EmptyElementConverter() {
  }

  public static EmptyElementModel fromDocx4j(CTEmptyElement value) {
    if (value == null) return null;
    return new EmptyElementModel();
  }

  public static CTEmptyElement toDocx4j(EmptyElementModel value) {
    if (value == null) return null;
    CTEmptyElement result = new CTEmptyElement();
    return result;
  }
}
