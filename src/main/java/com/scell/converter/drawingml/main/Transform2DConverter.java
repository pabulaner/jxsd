package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.Transform2DModel;
import org.docx4j.dml.CTTransform2D;

public class Transform2DConverter {
  private Transform2DConverter() {
  }

  public static Transform2DModel fromDocx4J(CTTransform2D value) {
    if (value == null) return null;
    return new Transform2DModel(BooleanConverter.fromDocx4J(value.isFlipV()), AngleConverter.fromDocx4J(value.getRot()), BooleanConverter.fromDocx4J(value.isFlipH()), Point2DConverter.fromDocx4J(value.getOff()), PositiveSize2DConverter.fromDocx4J(value.getExt()));
  }
}
