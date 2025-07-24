package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.EmptyElementModel;
import org.docx4j.dml.CTEmptyElement;

public class EmptyElementConverter {
  private EmptyElementConverter() {
  }

  public static EmptyElementModel fromDocx4J(CTEmptyElement value) {
    if (value == null) return null;
    return new EmptyElementModel();
  }
}
