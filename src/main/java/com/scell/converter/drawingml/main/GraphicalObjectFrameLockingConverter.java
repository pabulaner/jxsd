package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.GraphicalObjectFrameLockingModel;
import org.docx4j.dml.CTGraphicalObjectFrameLocking;

public class GraphicalObjectFrameLockingConverter {
  private GraphicalObjectFrameLockingConverter() {
  }

  public static GraphicalObjectFrameLockingModel fromDocx4J(CTGraphicalObjectFrameLocking value) {
    if (value == null) return null;
    return new GraphicalObjectFrameLockingModel(BooleanConverter.fromDocx4J(value.isNoDrilldown()), BooleanConverter.fromDocx4J(value.isNoResize()), BooleanConverter.fromDocx4J(value.isNoChangeAspect()), BooleanConverter.fromDocx4J(value.isNoSelect()), BooleanConverter.fromDocx4J(value.isNoGrp()), BooleanConverter.fromDocx4J(value.isNoMove()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
