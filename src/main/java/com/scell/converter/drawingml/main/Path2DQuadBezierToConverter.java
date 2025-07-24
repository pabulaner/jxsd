package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Path2DQuadBezierToModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPath2DQuadBezierTo;

public class Path2DQuadBezierToConverter {
  private Path2DQuadBezierToConverter() {
  }

  public static Path2DQuadBezierToModel fromDocx4J(CTPath2DQuadBezierTo value) {
    if (value == null) return null;
    return new Path2DQuadBezierToModel(value.getPt().stream().map(AdjPoint2DConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
