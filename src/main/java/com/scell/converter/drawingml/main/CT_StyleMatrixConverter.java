package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_StyleMatrixModel;
import org.docx4j.dml.CTStyleMatrix;

public class CT_StyleMatrixConverter {
  private CT_StyleMatrixConverter() {
  }

  public static CT_StyleMatrixModel fromDocx4j(CTStyleMatrix value) {
    if (value == null) return null;
    return new CT_StyleMatrixModel(StringConverter.fromDocx4j(value.getName()), CT_FillStyleListConverter.fromDocx4j(value.getFillStyleLst()), CT_LineStyleListConverter.fromDocx4j(value.getLnStyleLst()), CT_EffectStyleListConverter.fromDocx4j(value.getEffectStyleLst()), CT_BackgroundFillStyleListConverter.fromDocx4j(value.getBgFillStyleLst()));
  }

  public static CTStyleMatrix toDocx4j(CT_StyleMatrixModel value) {
    return null;
  }
}
