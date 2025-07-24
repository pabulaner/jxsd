package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ObjectStyleDefaultsModel;
import org.docx4j.dml.CTObjectStyleDefaults;

public class ObjectStyleDefaultsConverter {
  private ObjectStyleDefaultsConverter() {
  }

  public static ObjectStyleDefaultsModel fromDocx4J(CTObjectStyleDefaults value) {
    if (value == null) return null;
    return new ObjectStyleDefaultsModel(DefaultShapeDefinitionConverter.fromDocx4J(value.getSpDef()), DefaultShapeDefinitionConverter.fromDocx4J(value.getLnDef()), DefaultShapeDefinitionConverter.fromDocx4J(value.getTxDef()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
