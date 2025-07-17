package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_GraphicalObjectFrameLockingModel;
import org.docx4j.dml.CTGraphicalObjectFrameLocking;

public class CT_GraphicalObjectFrameLockingConverter {
  private CT_GraphicalObjectFrameLockingConverter() {
  }

  public static CT_GraphicalObjectFrameLockingModel fromDocx4j(
      CTGraphicalObjectFrameLocking value) {
    if (value == null) return null;
    return new CT_GraphicalObjectFrameLockingModel(BooleanConverter.fromDocx4j(value.getNoDrilldown()), BooleanConverter.fromDocx4j(value.getNoResize()), BooleanConverter.fromDocx4j(value.getNoChangeAspect()), BooleanConverter.fromDocx4j(value.getNoSelect()), BooleanConverter.fromDocx4j(value.getNoGrp()), BooleanConverter.fromDocx4j(value.getNoMove()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTGraphicalObjectFrameLocking toDocx4j(CT_GraphicalObjectFrameLockingModel value) {
    return null;
  }
}
