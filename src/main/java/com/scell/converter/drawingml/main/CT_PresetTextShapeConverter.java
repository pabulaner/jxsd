package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PresetTextShapeModel;
import org.docx4j.dml.CTPresetTextShape;

public class CT_PresetTextShapeConverter {
  private CT_PresetTextShapeConverter() {
  }

  public static CT_PresetTextShapeModel fromDocx4J(CTPresetTextShape value) {
    if (value == null) return null;
    return new CT_PresetTextShapeModel(ST_TextShapeTypeConverter.fromDocx4J(value.getPrst()), CT_GeomGuideListConverter.fromDocx4J(value.getAvLst()));
  }

  public static CTPresetTextShape toDocx4J(CT_PresetTextShapeModel value) {
    return null;
  }
}
