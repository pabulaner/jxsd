package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Path2DCubicBezierToModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPath2DCubicBezierTo;

public class Path2DCubicBezierToConverter {
  private Path2DCubicBezierToConverter() {
  }

  public static Path2DCubicBezierToModel fromDocx4J(CTPath2DCubicBezierTo value) {
    if (value == null) return null;
    return new Path2DCubicBezierToModel(value.getPt().stream().map(AdjPoint2DConverter::fromDocx4J).collect(Collectors.toList()));
  }
}
