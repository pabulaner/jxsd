package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_GroupTransform2DModel;
import org.docx4j.dml.CTGroupTransform2D;

public class CT_GroupTransform2DConverter {
  private CT_GroupTransform2DConverter() {
  }

  public static CT_GroupTransform2DModel fromDocx4j(CTGroupTransform2D value) {
    if (value == null) return null;
    return new CT_GroupTransform2DModel(BooleanConverter.fromDocx4j(value.getFlipV()), ST_AngleConverter.fromDocx4j(value.getRot()), BooleanConverter.fromDocx4j(value.getFlipH()), CT_Point2DConverter.fromDocx4j(value.getOff()), CT_PositiveSize2DConverter.fromDocx4j(value.getExt()), CT_Point2DConverter.fromDocx4j(value.getChOff()), CT_PositiveSize2DConverter.fromDocx4j(value.getChExt()));
  }

  public static CTGroupTransform2D toDocx4j(CT_GroupTransform2DModel value) {
    return null;
  }
}
