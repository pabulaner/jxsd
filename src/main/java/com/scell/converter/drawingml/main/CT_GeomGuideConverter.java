package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GeomGuideModel;
import org.docx4j.dml.CTGeomGuide;

public class CT_GeomGuideConverter {
  private CT_GeomGuideConverter() {
  }

  public static CT_GeomGuideModel fromDocx4j(CTGeomGuide value) {
    if (value == null) return null;
    return new CT_GeomGuideModel(ST_GeomGuideFormulaConverter.fromDocx4j(value.getFmla()), ST_GeomGuideNameConverter.fromDocx4j(value.getName()));
  }

  public static CTGeomGuide toDocx4j(CT_GeomGuideModel value) {
    return null;
  }
}
