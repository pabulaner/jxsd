package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Path2DMoveToModel;
import org.docx4j.dml.CTPath2DMoveTo;

public class Path2DMoveToConverter {
  private Path2DMoveToConverter() {
  }

  public static Path2DMoveToModel fromDocx4J(CTPath2DMoveTo value) {
    if (value == null) return null;
    return new Path2DMoveToModel(AdjPoint2DConverter.fromDocx4J(value.getPt()));
  }
}
