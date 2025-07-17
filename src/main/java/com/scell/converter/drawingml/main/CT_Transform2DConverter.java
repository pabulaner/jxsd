package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_Transform2DModel;
import org.docx4j.dml.CTTransform2D;

public class CT_Transform2DConverter {
  private CT_Transform2DConverter() {
  }

  public static CT_Transform2DModel fromDocx4j(CTTransform2D value) {
    if (value == null) return null;
    return new CT_Transform2DModel(BooleanConverter.fromDocx4j(value.getFlipV()), ST_AngleConverter.fromDocx4j(value.getRot()), BooleanConverter.fromDocx4j(value.getFlipH()), CT_Point2DConverter.fromDocx4j(value.getOff()), CT_PositiveSize2DConverter.fromDocx4j(value.getExt()));
  }

  public static CTTransform2D toDocx4j(CT_Transform2DModel value) {
    return null;
  }
}
