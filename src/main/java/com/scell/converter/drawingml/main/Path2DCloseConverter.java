package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Path2DCloseModel;
import org.docx4j.dml.CTPath2DClose;

public class Path2DCloseConverter {
  private Path2DCloseConverter() {
  }

  public static Path2DCloseModel fromDocx4J(CTPath2DClose value) {
    if (value == null) return null;
    return new Path2DCloseModel();
  }
}
