package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.DefaultShapeDefinitionModel;
import org.docx4j.dml.CTDefaultShapeDefinition;

public class DefaultShapeDefinitionConverter {
  private DefaultShapeDefinitionConverter() {
  }

  public static DefaultShapeDefinitionModel fromDocx4J(CTDefaultShapeDefinition value) {
    if (value == null) return null;
    return new DefaultShapeDefinitionModel(ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyPropertiesConverter.fromDocx4J(value.getBodyPr()), TextListStyleConverter.fromDocx4J(value.getLstStyle()), ShapeStyleConverter.fromDocx4J(value.getStyle()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
