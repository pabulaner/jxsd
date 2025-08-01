package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.GroupTransform2DModel;
import org.docx4j.dml.CTGroupTransform2D;

public class GroupTransform2DConverter {
  private GroupTransform2DConverter() {
  }

  public static GroupTransform2DModel fromDocx4J(CTGroupTransform2D value) {
    if (value == null) return null;
    return new GroupTransform2DModel(BooleanValueConverter.fromDocx4J(value.isFlipV()), AngleValueConverter.fromDocx4J(value.getRot()), BooleanValueConverter.fromDocx4J(value.isFlipH()), Point2DConverter.fromDocx4J(value.getOff()), PositiveSize2DConverter.fromDocx4J(value.getExt()), Point2DConverter.fromDocx4J(value.getChOff()), PositiveSize2DConverter.fromDocx4J(value.getChExt()));
  }
}
