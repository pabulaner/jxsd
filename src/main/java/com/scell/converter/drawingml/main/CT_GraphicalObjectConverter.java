package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GraphicalObjectModel;
import org.docx4j.dml.CTGraphicalObject;

public class CT_GraphicalObjectConverter {
  private CT_GraphicalObjectConverter() {
  }

  public static CT_GraphicalObjectModel fromDocx4j(CTGraphicalObject value) {
    if (value == null) return null;
    return new CT_GraphicalObjectModel(CT_GraphicalObjectDataConverter.fromDocx4j(value.getGraphicData()));
  }

  public static CTGraphicalObject toDocx4j(CT_GraphicalObjectModel value) {
    return null;
  }
}
