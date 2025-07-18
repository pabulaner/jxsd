package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_StyleMatrixModel;
import org.docx4j.dml.CTStyleMatrix;

public class CT_StyleMatrixConverter {
  private CT_StyleMatrixConverter() {
  }

  public static CT_StyleMatrixModel fromDocx4J(CTStyleMatrix value) {
    if (value == null) return null;
    return new CT_StyleMatrixModel(StringConverter.fromDocx4J(value.getName()), CT_FillStyleListConverter.fromDocx4J(value.getFillStyleLst()), CT_LineStyleListConverter.fromDocx4J(value.getLnStyleLst()), CT_EffectStyleListConverter.fromDocx4J(value.getEffectStyleLst()), CT_BackgroundFillStyleListConverter.fromDocx4J(value.getBgFillStyleLst()));
  }

  public static CTStyleMatrix toDocx4J(CT_StyleMatrixModel value) {
    return null;
  }
}
