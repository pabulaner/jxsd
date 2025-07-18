package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PresetGeometry2DModel;
import org.docx4j.dml.CTPresetGeometry2D;

public class CT_PresetGeometry2DConverter {
  private CT_PresetGeometry2DConverter() {
  }

  public static CT_PresetGeometry2DModel fromDocx4J(CTPresetGeometry2D value) {
    if (value == null) return null;
    return new CT_PresetGeometry2DModel(ST_ShapeTypeConverter.fromDocx4J(value.getPrst()), CT_GeomGuideListConverter.fromDocx4J(value.getAvLst()));
  }

  public static CTPresetGeometry2D toDocx4J(CT_PresetGeometry2DModel value) {
    return null;
  }
}
