package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.GraphicalObjectFrameLockingModel;
import org.docx4j.dml.CTGraphicalObjectFrameLocking;

public class GraphicalObjectFrameLockingConverter {
  private GraphicalObjectFrameLockingConverter() {
  }

  public static GraphicalObjectFrameLockingModel fromDocx4J(CTGraphicalObjectFrameLocking value) {
    if (value == null) return null;
    return new GraphicalObjectFrameLockingModel(BooleanValueConverter.fromDocx4J(value.isNoDrilldown()), BooleanValueConverter.fromDocx4J(value.isNoResize()), BooleanValueConverter.fromDocx4J(value.isNoChangeAspect()), BooleanValueConverter.fromDocx4J(value.isNoSelect()), BooleanValueConverter.fromDocx4J(value.isNoGrp()), BooleanValueConverter.fromDocx4J(value.isNoMove()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
