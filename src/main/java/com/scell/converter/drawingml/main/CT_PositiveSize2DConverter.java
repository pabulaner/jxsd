package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PositiveSize2DModel;
import org.docx4j.dml.CTPositiveSize2D;

public class CT_PositiveSize2DConverter {
  private CT_PositiveSize2DConverter() {
  }

  public static CT_PositiveSize2DModel fromDocx4j(CTPositiveSize2D value) {
    if (value == null) return null;
    return new CT_PositiveSize2DModel(ST_PositiveCoordinateConverter.fromDocx4j(value.getCy()), ST_PositiveCoordinateConverter.fromDocx4j(value.getCx()));
  }

  public static CTPositiveSize2D toDocx4j(CT_PositiveSize2DModel value) {
    return null;
  }
}
