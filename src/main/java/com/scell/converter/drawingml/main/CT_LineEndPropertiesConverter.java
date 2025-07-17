package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LineEndPropertiesModel;
import org.docx4j.dml.CTLineEndProperties;

public class CT_LineEndPropertiesConverter {
  private CT_LineEndPropertiesConverter() {
  }

  public static CT_LineEndPropertiesModel fromDocx4j(CTLineEndProperties value) {
    if (value == null) return null;
    return new CT_LineEndPropertiesModel(ST_LineEndTypeConverter.fromDocx4j(value.getType()), ST_LineEndWidthConverter.fromDocx4j(value.getW()), ST_LineEndLengthConverter.fromDocx4j(value.getLen()));
  }

  public static CTLineEndProperties toDocx4j(CT_LineEndPropertiesModel value) {
    return null;
  }
}
