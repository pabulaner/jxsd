package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_GraphicalObjectFrameLockingModel;
import org.docx4j.dml.CTGraphicalObjectFrameLocking;

public class CT_GraphicalObjectFrameLockingConverter {
  private CT_GraphicalObjectFrameLockingConverter() {
  }

  public static CT_GraphicalObjectFrameLockingModel fromDocx4J(
      CTGraphicalObjectFrameLocking value) {
    if (value == null) return null;
    return new CT_GraphicalObjectFrameLockingModel(BooleanConverter.fromDocx4J(value.getNoDrilldown()), BooleanConverter.fromDocx4J(value.getNoResize()), BooleanConverter.fromDocx4J(value.getNoChangeAspect()), BooleanConverter.fromDocx4J(value.getNoSelect()), BooleanConverter.fromDocx4J(value.getNoGrp()), BooleanConverter.fromDocx4J(value.getNoMove()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTGraphicalObjectFrameLocking toDocx4J(CT_GraphicalObjectFrameLockingModel value) {
    return null;
  }
}
