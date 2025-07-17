package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_ConnectorLockingModel;
import org.docx4j.dml.CTConnectorLocking;

public class CT_ConnectorLockingConverter {
  private CT_ConnectorLockingConverter() {
  }

  public static CT_ConnectorLockingModel fromDocx4j(CTConnectorLocking value) {
    if (value == null) return null;
    return new CT_ConnectorLockingModel(BooleanConverter.fromDocx4j(value.getNoResize()), BooleanConverter.fromDocx4j(value.getNoChangeAspect()), BooleanConverter.fromDocx4j(value.getNoEditPoints()), BooleanConverter.fromDocx4j(value.getNoChangeArrowheads()), BooleanConverter.fromDocx4j(value.getNoSelect()), BooleanConverter.fromDocx4j(value.getNoGrp()), BooleanConverter.fromDocx4j(value.getNoMove()), BooleanConverter.fromDocx4j(value.getNoRot()), BooleanConverter.fromDocx4j(value.getNoChangeShapeType()), BooleanConverter.fromDocx4j(value.getNoAdjustHandles()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTConnectorLocking toDocx4j(CT_ConnectorLockingModel value) {
    return null;
  }
}
