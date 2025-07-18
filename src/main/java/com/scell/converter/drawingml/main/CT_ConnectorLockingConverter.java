package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_ConnectorLockingModel;
import org.docx4j.dml.CTConnectorLocking;

public class CT_ConnectorLockingConverter {
  private CT_ConnectorLockingConverter() {
  }

  public static CT_ConnectorLockingModel fromDocx4J(CTConnectorLocking value) {
    if (value == null) return null;
    return new CT_ConnectorLockingModel(BooleanConverter.fromDocx4J(value.getNoResize()), BooleanConverter.fromDocx4J(value.getNoChangeAspect()), BooleanConverter.fromDocx4J(value.getNoEditPoints()), BooleanConverter.fromDocx4J(value.getNoChangeArrowheads()), BooleanConverter.fromDocx4J(value.getNoSelect()), BooleanConverter.fromDocx4J(value.getNoGrp()), BooleanConverter.fromDocx4J(value.getNoMove()), BooleanConverter.fromDocx4J(value.getNoRot()), BooleanConverter.fromDocx4J(value.getNoChangeShapeType()), BooleanConverter.fromDocx4J(value.getNoAdjustHandles()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTConnectorLocking toDocx4J(CT_ConnectorLockingModel value) {
    return null;
  }
}
