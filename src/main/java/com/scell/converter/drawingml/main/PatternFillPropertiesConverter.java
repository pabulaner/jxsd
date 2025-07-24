package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import org.docx4j.dml.CTPatternFillProperties;

public class PatternFillPropertiesConverter {
  private PatternFillPropertiesConverter() {
  }

  public static PatternFillPropertiesModel fromDocx4J(CTPatternFillProperties value) {
    if (value == null) return null;
    return new PatternFillPropertiesModel(PresetPatternValConverter.fromDocx4J(value.getPrst()), ColorConverter.fromDocx4J(value.getFgClr()), ColorConverter.fromDocx4J(value.getBgClr()));
  }
}
