package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.ConnectorLockingModel;
import org.docx4j.dml.CTConnectorLocking;

public class ConnectorLockingConverter {
  private ConnectorLockingConverter() {
  }

  public static ConnectorLockingModel fromDocx4J(CTConnectorLocking value) {
    if (value == null) return null;
    return new ConnectorLockingModel(BooleanValueConverter.fromDocx4J(value.isNoResize()), BooleanValueConverter.fromDocx4J(value.isNoChangeAspect()), BooleanValueConverter.fromDocx4J(value.isNoEditPoints()), BooleanValueConverter.fromDocx4J(value.isNoChangeArrowheads()), BooleanValueConverter.fromDocx4J(value.isNoSelect()), BooleanValueConverter.fromDocx4J(value.isNoGrp()), BooleanValueConverter.fromDocx4J(value.isNoMove()), BooleanValueConverter.fromDocx4J(value.isNoRot()), BooleanValueConverter.fromDocx4J(value.isNoChangeShapeType()), BooleanValueConverter.fromDocx4J(value.isNoAdjustHandles()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
