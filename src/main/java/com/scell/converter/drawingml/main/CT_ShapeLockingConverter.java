package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_ShapeLockingModel;
import org.docx4j.dml.CTShapeLocking;

public class CT_ShapeLockingConverter {
  private CT_ShapeLockingConverter() {
  }

  public static CT_ShapeLockingModel fromDocx4j(CTShapeLocking value) {
    if (value == null) return null;
    return new CT_ShapeLockingModel(BooleanConverter.fromDocx4j(value.getNoResize()), BooleanConverter.fromDocx4j(value.getNoChangeAspect()), BooleanConverter.fromDocx4j(value.getNoEditPoints()), BooleanConverter.fromDocx4j(value.getNoChangeArrowheads()), BooleanConverter.fromDocx4j(value.getNoTextEdit()), BooleanConverter.fromDocx4j(value.getNoSelect()), BooleanConverter.fromDocx4j(value.getNoGrp()), BooleanConverter.fromDocx4j(value.getNoMove()), BooleanConverter.fromDocx4j(value.getNoRot()), BooleanConverter.fromDocx4j(value.getNoChangeShapeType()), BooleanConverter.fromDocx4j(value.getNoAdjustHandles()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTShapeLocking toDocx4j(CT_ShapeLockingModel value) {
    return null;
  }
}
