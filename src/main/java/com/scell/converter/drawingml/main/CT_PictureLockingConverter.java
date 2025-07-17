package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_PictureLockingModel;
import org.docx4j.dml.CTPictureLocking;

public class CT_PictureLockingConverter {
  private CT_PictureLockingConverter() {
  }

  public static CT_PictureLockingModel fromDocx4j(CTPictureLocking value) {
    if (value == null) return null;
    return new CT_PictureLockingModel(BooleanConverter.fromDocx4j(value.getNoResize()), BooleanConverter.fromDocx4j(value.getNoChangeAspect()), BooleanConverter.fromDocx4j(value.getNoEditPoints()), BooleanConverter.fromDocx4j(value.getNoChangeArrowheads()), BooleanConverter.fromDocx4j(value.getNoCrop()), BooleanConverter.fromDocx4j(value.getNoSelect()), BooleanConverter.fromDocx4j(value.getNoGrp()), BooleanConverter.fromDocx4j(value.getNoMove()), BooleanConverter.fromDocx4j(value.getNoRot()), BooleanConverter.fromDocx4j(value.getNoChangeShapeType()), BooleanConverter.fromDocx4j(value.getNoAdjustHandles()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPictureLocking toDocx4j(CT_PictureLockingModel value) {
    return null;
  }
}
