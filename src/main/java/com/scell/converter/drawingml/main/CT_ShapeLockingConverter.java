package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_ShapeLockingModel;
import org.docx4j.dml.CTShapeLocking;

public class CT_ShapeLockingConverter {
  private CT_ShapeLockingConverter() {
  }

  public static CT_ShapeLockingModel fromDocx4J(CTShapeLocking value) {
    if (value == null) return null;
    return new CT_ShapeLockingModel(BooleanConverter.fromDocx4J(value.getNoResize()), BooleanConverter.fromDocx4J(value.getNoChangeAspect()), BooleanConverter.fromDocx4J(value.getNoEditPoints()), BooleanConverter.fromDocx4J(value.getNoChangeArrowheads()), BooleanConverter.fromDocx4J(value.getNoTextEdit()), BooleanConverter.fromDocx4J(value.getNoSelect()), BooleanConverter.fromDocx4J(value.getNoGrp()), BooleanConverter.fromDocx4J(value.getNoMove()), BooleanConverter.fromDocx4J(value.getNoRot()), BooleanConverter.fromDocx4J(value.getNoChangeShapeType()), BooleanConverter.fromDocx4J(value.getNoAdjustHandles()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTShapeLocking toDocx4J(CT_ShapeLockingModel value) {
    return null;
  }
}
