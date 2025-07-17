package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PresetGeometry2DModel;
import org.docx4j.dml.CTPresetGeometry2D;

public class CT_PresetGeometry2DConverter {
  private CT_PresetGeometry2DConverter() {
  }

  public static CT_PresetGeometry2DModel fromDocx4j(CTPresetGeometry2D value) {
    if (value == null) return null;
    return new CT_PresetGeometry2DModel(ST_ShapeTypeConverter.fromDocx4j(value.getPrst()), CT_GeomGuideListConverter.fromDocx4j(value.getAvLst()));
  }

  public static CTPresetGeometry2D toDocx4j(CT_PresetGeometry2DModel value) {
    return null;
  }
}
