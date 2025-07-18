package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.main.CT_GraphicalObjectDataModel;
import org.docx4j.dml.CTGraphicalObjectData;

public class CT_GraphicalObjectDataConverter {
  private CT_GraphicalObjectDataConverter() {
  }

  public static CT_GraphicalObjectDataModel fromDocx4J(CTGraphicalObjectData value) {
    if (value == null) return null;
    return new CT_GraphicalObjectDataModel(TokenConverter.fromDocx4J(value.getUri()));
  }

  public static CTGraphicalObjectData toDocx4J(CT_GraphicalObjectDataModel value) {
    return null;
  }
}
