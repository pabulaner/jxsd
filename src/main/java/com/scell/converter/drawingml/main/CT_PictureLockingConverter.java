package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_PictureLockingModel;
import org.docx4j.dml.CTPictureLocking;

public class CT_PictureLockingConverter {
  private CT_PictureLockingConverter() {
  }

  public static CT_PictureLockingModel fromDocx4J(CTPictureLocking value) {
    if (value == null) return null;
    return new CT_PictureLockingModel(BooleanConverter.fromDocx4J(value.getNoResize()), BooleanConverter.fromDocx4J(value.getNoChangeAspect()), BooleanConverter.fromDocx4J(value.getNoEditPoints()), BooleanConverter.fromDocx4J(value.getNoChangeArrowheads()), BooleanConverter.fromDocx4J(value.getNoCrop()), BooleanConverter.fromDocx4J(value.getNoSelect()), BooleanConverter.fromDocx4J(value.getNoGrp()), BooleanConverter.fromDocx4J(value.getNoMove()), BooleanConverter.fromDocx4J(value.getNoRot()), BooleanConverter.fromDocx4J(value.getNoChangeShapeType()), BooleanConverter.fromDocx4J(value.getNoAdjustHandles()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTPictureLocking toDocx4J(CT_PictureLockingModel value) {
    return null;
  }
}
