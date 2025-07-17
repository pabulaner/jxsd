package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ObjectStyleDefaultsModel;
import org.docx4j.dml.CTObjectStyleDefaults;

public class CT_ObjectStyleDefaultsConverter {
  private CT_ObjectStyleDefaultsConverter() {
  }

  public static CT_ObjectStyleDefaultsModel fromDocx4j(CTObjectStyleDefaults value) {
    if (value == null) return null;
    return new CT_ObjectStyleDefaultsModel(CT_DefaultShapeDefinitionConverter.fromDocx4j(value.getSpDef()), CT_DefaultShapeDefinitionConverter.fromDocx4j(value.getLnDef()), CT_DefaultShapeDefinitionConverter.fromDocx4j(value.getTxDef()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTObjectStyleDefaults toDocx4j(CT_ObjectStyleDefaultsModel value) {
    return null;
  }
}
