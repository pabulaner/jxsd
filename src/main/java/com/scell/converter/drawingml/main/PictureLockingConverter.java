package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.PictureLockingModel;
import org.docx4j.dml.CTPictureLocking;

public class PictureLockingConverter {
  private PictureLockingConverter() {
  }

  public static PictureLockingModel fromDocx4J(CTPictureLocking value) {
    if (value == null) return null;
    return new PictureLockingModel(BooleanValueConverter.fromDocx4J(value.isNoResize()), BooleanValueConverter.fromDocx4J(value.isNoChangeAspect()), BooleanValueConverter.fromDocx4J(value.isNoEditPoints()), BooleanValueConverter.fromDocx4J(value.isNoChangeArrowheads()), BooleanValueConverter.fromDocx4J(value.isNoCrop()), BooleanValueConverter.fromDocx4J(value.isNoSelect()), BooleanValueConverter.fromDocx4J(value.isNoGrp()), BooleanValueConverter.fromDocx4J(value.isNoMove()), BooleanValueConverter.fromDocx4J(value.isNoRot()), BooleanValueConverter.fromDocx4J(value.isNoChangeShapeType()), BooleanValueConverter.fromDocx4J(value.isNoAdjustHandles()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
