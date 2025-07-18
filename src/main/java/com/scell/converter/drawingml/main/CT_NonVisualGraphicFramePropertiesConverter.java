package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_NonVisualGraphicFramePropertiesModel;
import org.docx4j.dml.CTNonVisualGraphicFrameProperties;

public class CT_NonVisualGraphicFramePropertiesConverter {
  private CT_NonVisualGraphicFramePropertiesConverter() {
  }

  public static CT_NonVisualGraphicFramePropertiesModel fromDocx4J(
      CTNonVisualGraphicFrameProperties value) {
    if (value == null) return null;
    return new CT_NonVisualGraphicFramePropertiesModel(CT_GraphicalObjectFrameLockingConverter.fromDocx4J(value.getGraphicFrameLocks()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTNonVisualGraphicFrameProperties toDocx4J(
      CT_NonVisualGraphicFramePropertiesModel value) {
    return null;
  }
}
