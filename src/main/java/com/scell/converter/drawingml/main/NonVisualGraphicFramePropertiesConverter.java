package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.NonVisualGraphicFramePropertiesModel;
import org.docx4j.dml.CTNonVisualGraphicFrameProperties;

public class NonVisualGraphicFramePropertiesConverter {
  private NonVisualGraphicFramePropertiesConverter() {
  }

  public static NonVisualGraphicFramePropertiesModel fromDocx4J(
      CTNonVisualGraphicFrameProperties value) {
    if (value == null) return null;
    return new NonVisualGraphicFramePropertiesModel(GraphicalObjectFrameLockingConverter.fromDocx4J(value.getGraphicFrameLocks()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
