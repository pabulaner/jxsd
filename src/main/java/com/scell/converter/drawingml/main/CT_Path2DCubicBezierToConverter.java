package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DCubicBezierToModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPath2DCubicBezierTo;

public class CT_Path2DCubicBezierToConverter {
  private CT_Path2DCubicBezierToConverter() {
  }

  public static CT_Path2DCubicBezierToModel fromDocx4J(CTPath2DCubicBezierTo value) {
    if (value == null) return null;
    return new CT_Path2DCubicBezierToModel(value.getPt().stream().map(CT_AdjPoint2DConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTPath2DCubicBezierTo toDocx4J(CT_Path2DCubicBezierToModel value) {
    return null;
  }
}
