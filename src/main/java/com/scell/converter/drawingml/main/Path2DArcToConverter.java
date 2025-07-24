package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Path2DArcToModel;
import org.docx4j.dml.CTPath2DArcTo;

public class Path2DArcToConverter {
  private Path2DArcToConverter() {
  }

  public static Path2DArcToModel fromDocx4J(CTPath2DArcTo value) {
    if (value == null) return null;
    return new Path2DArcToModel(AdjAngleConverter.fromDocx4J(value.getStAng()), AdjAngleConverter.fromDocx4J(value.getSwAng()), AdjCoordinateConverter.fromDocx4J(value.getWR()), AdjCoordinateConverter.fromDocx4J(value.getHR()));
  }
}
