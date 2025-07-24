package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Path2DLineToModel;
import org.docx4j.dml.CTPath2DLineTo;

public class Path2DLineToConverter {
  private Path2DLineToConverter() {
  }

  public static Path2DLineToModel fromDocx4J(CTPath2DLineTo value) {
    if (value == null) return null;
    return new Path2DLineToModel(AdjPoint2DConverter.fromDocx4J(value.getPt()));
  }
}
