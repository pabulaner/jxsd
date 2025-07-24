package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetTextShapeModel;
import org.docx4j.dml.CTPresetTextShape;

public class PresetTextShapeConverter {
  private PresetTextShapeConverter() {
  }

  public static PresetTextShapeModel fromDocx4J(CTPresetTextShape value) {
    if (value == null) return null;
    return new PresetTextShapeModel(TextShapeTypeConverter.fromDocx4J(value.getPrst()), GeomGuideListConverter.fromDocx4J(value.getAvLst()));
  }
}
