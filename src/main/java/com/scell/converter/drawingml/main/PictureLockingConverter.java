package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.PictureLockingModel;
import org.docx4j.dml.CTPictureLocking;

public class PictureLockingConverter {
  private PictureLockingConverter() {
  }

  public static PictureLockingModel fromDocx4J(CTPictureLocking value) {
    if (value == null) return null;
    return new PictureLockingModel(BooleanConverter.fromDocx4J(value.isNoResize()), BooleanConverter.fromDocx4J(value.isNoChangeAspect()), BooleanConverter.fromDocx4J(value.isNoEditPoints()), BooleanConverter.fromDocx4J(value.isNoChangeArrowheads()), BooleanConverter.fromDocx4J(value.isNoCrop()), BooleanConverter.fromDocx4J(value.isNoSelect()), BooleanConverter.fromDocx4J(value.isNoGrp()), BooleanConverter.fromDocx4J(value.isNoMove()), BooleanConverter.fromDocx4J(value.isNoRot()), BooleanConverter.fromDocx4J(value.isNoChangeShapeType()), BooleanConverter.fromDocx4J(value.isNoAdjustHandles()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
