package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_EmptyElementModel;
import org.docx4j.dml.CTEmptyElement;

public class CT_EmptyElementConverter {
  private CT_EmptyElementConverter() {
  }

  public static CT_EmptyElementModel fromDocx4j(CTEmptyElement value) {
    if (value == null) return null;
    return new CT_EmptyElementModel();
  }

  public static CTEmptyElement toDocx4j(CT_EmptyElementModel value) {
    return null;
  }
}
