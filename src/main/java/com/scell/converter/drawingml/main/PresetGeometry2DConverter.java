package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PresetGeometry2DModel;
import org.docx4j.dml.CTPresetGeometry2D;

public class PresetGeometry2DConverter {
  private PresetGeometry2DConverter() {
  }

  public static PresetGeometry2DModel fromDocx4J(CTPresetGeometry2D value) {
    if (value == null) return null;
    return new PresetGeometry2DModel(ShapeTypeConverter.fromDocx4J(value.getPrst()), GeomGuideListConverter.fromDocx4J(value.getAvLst()));
  }
}
