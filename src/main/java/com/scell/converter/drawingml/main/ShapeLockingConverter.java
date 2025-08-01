package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.ShapeLockingModel;
import org.docx4j.dml.CTShapeLocking;

public class ShapeLockingConverter {
  private ShapeLockingConverter() {
  }

  public static ShapeLockingModel fromDocx4J(CTShapeLocking value) {
    if (value == null) return null;
    return new ShapeLockingModel(BooleanValueConverter.fromDocx4J(value.isNoResize()), BooleanValueConverter.fromDocx4J(value.isNoChangeAspect()), BooleanValueConverter.fromDocx4J(value.isNoEditPoints()), BooleanValueConverter.fromDocx4J(value.isNoChangeArrowheads()), BooleanValueConverter.fromDocx4J(value.isNoTextEdit()), BooleanValueConverter.fromDocx4J(value.isNoSelect()), BooleanValueConverter.fromDocx4J(value.isNoGrp()), BooleanValueConverter.fromDocx4J(value.isNoMove()), BooleanValueConverter.fromDocx4J(value.isNoRot()), BooleanValueConverter.fromDocx4J(value.isNoChangeShapeType()), BooleanValueConverter.fromDocx4J(value.isNoAdjustHandles()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
