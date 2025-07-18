package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_Transform2DModel;
import org.docx4j.dml.CTTransform2D;

public class CT_Transform2DConverter {
  private CT_Transform2DConverter() {
  }

  public static CT_Transform2DModel fromDocx4J(CTTransform2D value) {
    if (value == null) return null;
    return new CT_Transform2DModel(BooleanConverter.fromDocx4J(value.getFlipV()), ST_AngleConverter.fromDocx4J(value.getRot()), BooleanConverter.fromDocx4J(value.getFlipH()), CT_Point2DConverter.fromDocx4J(value.getOff()), CT_PositiveSize2DConverter.fromDocx4J(value.getExt()));
  }

  public static CTTransform2D toDocx4J(CT_Transform2DModel value) {
    return null;
  }
}
