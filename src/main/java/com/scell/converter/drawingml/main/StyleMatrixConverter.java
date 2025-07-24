package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.StyleMatrixModel;
import org.docx4j.dml.CTStyleMatrix;

public class StyleMatrixConverter {
  private StyleMatrixConverter() {
  }

  public static StyleMatrixModel fromDocx4J(CTStyleMatrix value) {
    if (value == null) return null;
    return new StyleMatrixModel(StringConverter.fromDocx4J(value.getName()), FillStyleListConverter.fromDocx4J(value.getFillStyleLst()), LineStyleListConverter.fromDocx4J(value.getLnStyleLst()), EffectStyleListConverter.fromDocx4J(value.getEffectStyleLst()), BackgroundFillStyleListConverter.fromDocx4J(value.getBgFillStyleLst()));
  }
}
