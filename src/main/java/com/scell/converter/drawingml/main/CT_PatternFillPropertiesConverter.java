package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import org.docx4j.dml.CTPatternFillProperties;

public class CT_PatternFillPropertiesConverter {
  private CT_PatternFillPropertiesConverter() {
  }

  public static CT_PatternFillPropertiesModel fromDocx4J(CTPatternFillProperties value) {
    if (value == null) return null;
    return new CT_PatternFillPropertiesModel(ST_PresetPatternValConverter.fromDocx4J(value.getPrst()), CT_ColorConverter.fromDocx4J(value.getFgClr()), CT_ColorConverter.fromDocx4J(value.getBgClr()));
  }

  public static CTPatternFillProperties toDocx4J(CT_PatternFillPropertiesModel value) {
    return null;
  }
}
