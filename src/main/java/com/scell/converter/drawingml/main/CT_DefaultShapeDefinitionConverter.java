package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_DefaultShapeDefinitionModel;
import org.docx4j.dml.CTDefaultShapeDefinition;

public class CT_DefaultShapeDefinitionConverter {
  private CT_DefaultShapeDefinitionConverter() {
  }

  public static CT_DefaultShapeDefinitionModel fromDocx4j(CTDefaultShapeDefinition value) {
    if (value == null) return null;
    return new CT_DefaultShapeDefinitionModel(CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyPropertiesConverter.fromDocx4j(value.getBodyPr()), CT_TextListStyleConverter.fromDocx4j(value.getLstStyle()), CT_ShapeStyleConverter.fromDocx4j(value.getStyle()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDefaultShapeDefinition toDocx4j(CT_DefaultShapeDefinitionModel value) {
    return null;
  }
}
