package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_DefaultShapeDefinitionModel;
import org.docx4j.dml.CTDefaultShapeDefinition;

public class CT_DefaultShapeDefinitionConverter {
  private CT_DefaultShapeDefinitionConverter() {
  }

  public static CT_DefaultShapeDefinitionModel fromDocx4J(CTDefaultShapeDefinition value) {
    if (value == null) return null;
    return new CT_DefaultShapeDefinitionModel(CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_TextBodyPropertiesConverter.fromDocx4J(value.getBodyPr()), CT_TextListStyleConverter.fromDocx4J(value.getLstStyle()), CT_ShapeStyleConverter.fromDocx4J(value.getStyle()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTDefaultShapeDefinition toDocx4J(CT_DefaultShapeDefinitionModel value) {
    return null;
  }
}
