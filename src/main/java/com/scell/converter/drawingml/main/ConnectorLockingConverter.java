package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.ConnectorLockingModel;
import org.docx4j.dml.CTConnectorLocking;

public class ConnectorLockingConverter {
  private ConnectorLockingConverter() {
  }

  public static ConnectorLockingModel fromDocx4J(CTConnectorLocking value) {
    if (value == null) return null;
    return new ConnectorLockingModel(BooleanConverter.fromDocx4J(value.isNoResize()), BooleanConverter.fromDocx4J(value.isNoChangeAspect()), BooleanConverter.fromDocx4J(value.isNoEditPoints()), BooleanConverter.fromDocx4J(value.isNoChangeArrowheads()), BooleanConverter.fromDocx4J(value.isNoSelect()), BooleanConverter.fromDocx4J(value.isNoGrp()), BooleanConverter.fromDocx4J(value.isNoMove()), BooleanConverter.fromDocx4J(value.isNoRot()), BooleanConverter.fromDocx4J(value.isNoChangeShapeType()), BooleanConverter.fromDocx4J(value.isNoAdjustHandles()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
