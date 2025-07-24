package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPointModel;
import org.docx4j.dml.CTTextSpacingPoint;

public class TextSpacingPointConverter {
  private TextSpacingPointConverter() {
  }

  public static TextSpacingPointModel fromDocx4J(CTTextSpacingPoint value) {
    if (value == null) return null;
    return new TextSpacingPointModel(TextSpacingPointConverter.fromDocx4J(value.getVal()));
  }
}
