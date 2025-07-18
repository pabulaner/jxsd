package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ObjectStyleDefaultsModel;
import org.docx4j.dml.CTObjectStyleDefaults;

public class CT_ObjectStyleDefaultsConverter {
  private CT_ObjectStyleDefaultsConverter() {
  }

  public static CT_ObjectStyleDefaultsModel fromDocx4J(CTObjectStyleDefaults value) {
    if (value == null) return null;
    return new CT_ObjectStyleDefaultsModel(CT_DefaultShapeDefinitionConverter.fromDocx4J(value.getSpDef()), CT_DefaultShapeDefinitionConverter.fromDocx4J(value.getLnDef()), CT_DefaultShapeDefinitionConverter.fromDocx4J(value.getTxDef()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTObjectStyleDefaults toDocx4J(CT_ObjectStyleDefaultsModel value) {
    return null;
  }
}
