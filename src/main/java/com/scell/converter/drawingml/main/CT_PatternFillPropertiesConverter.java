package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import org.docx4j.dml.CTPatternFillProperties;

public class CT_PatternFillPropertiesConverter {
  private CT_PatternFillPropertiesConverter() {
  }

  public static CT_PatternFillPropertiesModel fromDocx4j(CTPatternFillProperties value) {
    if (value == null) return null;
    return new CT_PatternFillPropertiesModel(ST_PresetPatternValConverter.fromDocx4j(value.getPrst()), CT_ColorConverter.fromDocx4j(value.getFgClr()), CT_ColorConverter.fromDocx4j(value.getBgClr()));
  }

  public static CTPatternFillProperties toDocx4j(CT_PatternFillPropertiesModel value) {
    return null;
  }
}
