package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_GroupTransform2DModel;
import org.docx4j.dml.CTGroupTransform2D;

public class CT_GroupTransform2DConverter {
  private CT_GroupTransform2DConverter() {
  }

  public static CT_GroupTransform2DModel fromDocx4J(CTGroupTransform2D value) {
    if (value == null) return null;
    return new CT_GroupTransform2DModel(BooleanConverter.fromDocx4J(value.getFlipV()), ST_AngleConverter.fromDocx4J(value.getRot()), BooleanConverter.fromDocx4J(value.getFlipH()), CT_Point2DConverter.fromDocx4J(value.getOff()), CT_PositiveSize2DConverter.fromDocx4J(value.getExt()), CT_Point2DConverter.fromDocx4J(value.getChOff()), CT_PositiveSize2DConverter.fromDocx4J(value.getChExt()));
  }

  public static CTGroupTransform2D toDocx4J(CT_GroupTransform2DModel value) {
    return null;
  }
}
