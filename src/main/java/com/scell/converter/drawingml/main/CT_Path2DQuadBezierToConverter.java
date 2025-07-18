package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DQuadBezierToModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTPath2DQuadBezierTo;

public class CT_Path2DQuadBezierToConverter {
  private CT_Path2DQuadBezierToConverter() {
  }

  public static CT_Path2DQuadBezierToModel fromDocx4J(CTPath2DQuadBezierTo value) {
    if (value == null) return null;
    return new CT_Path2DQuadBezierToModel(value.getPt().stream().map(CT_AdjPoint2DConverter::fromDocx4J).collect(Collectors.toList()));
  }

  public static CTPath2DQuadBezierTo toDocx4J(CT_Path2DQuadBezierToModel value) {
    return null;
  }
}
