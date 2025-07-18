package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DArcToModel;
import org.docx4j.dml.CTPath2DArcTo;

public class CT_Path2DArcToConverter {
  private CT_Path2DArcToConverter() {
  }

  public static CT_Path2DArcToModel fromDocx4J(CTPath2DArcTo value) {
    if (value == null) return null;
    return new CT_Path2DArcToModel(ST_AdjAngleConverter.fromDocx4J(value.getStAng()), ST_AdjAngleConverter.fromDocx4J(value.getSwAng()), ST_AdjCoordinateConverter.fromDocx4J(value.getWR()), ST_AdjCoordinateConverter.fromDocx4J(value.getHR()));
  }

  public static CTPath2DArcTo toDocx4J(CT_Path2DArcToModel value) {
    return null;
  }
}
