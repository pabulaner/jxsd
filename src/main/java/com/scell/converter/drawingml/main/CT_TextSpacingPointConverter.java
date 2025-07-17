package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextSpacingPointModel;
import org.docx4j.dml.CTTextSpacingPoint;

public class CT_TextSpacingPointConverter {
  private CT_TextSpacingPointConverter() {
  }

  public static CT_TextSpacingPointModel fromDocx4j(CTTextSpacingPoint value) {
    if (value == null) return null;
    return new CT_TextSpacingPointModel(ST_TextSpacingPointConverter.fromDocx4j(value.getVal()));
  }

  public static CTTextSpacingPoint toDocx4j(CT_TextSpacingPointModel value) {
    return null;
  }
}
