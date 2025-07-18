package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DCloseModel;
import org.docx4j.dml.CTPath2DClose;

public class CT_Path2DCloseConverter {
  private CT_Path2DCloseConverter() {
  }

  public static CT_Path2DCloseModel fromDocx4J(CTPath2DClose value) {
    if (value == null) return null;
    return new CT_Path2DCloseModel();
  }

  public static CTPath2DClose toDocx4J(CT_Path2DCloseModel value) {
    return null;
  }
}
