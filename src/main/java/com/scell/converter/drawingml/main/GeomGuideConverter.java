package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideModel;
import org.docx4j.dml.CTGeomGuide;

public class GeomGuideConverter {
  private GeomGuideConverter() {
  }

  public static GeomGuideModel fromDocx4J(CTGeomGuide value) {
    if (value == null) return null;
    return new GeomGuideModel(GeomGuideFormulaConverter.fromDocx4J(value.getFmla()), GeomGuideNameConverter.fromDocx4J(value.getName()));
  }
}
