package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LineEndPropertiesModel;
import org.docx4j.dml.CTLineEndProperties;

public class CT_LineEndPropertiesConverter {
  private CT_LineEndPropertiesConverter() {
  }

  public static CT_LineEndPropertiesModel fromDocx4J(CTLineEndProperties value) {
    if (value == null) return null;
    return new CT_LineEndPropertiesModel(ST_LineEndTypeConverter.fromDocx4J(value.getType()), ST_LineEndWidthConverter.fromDocx4J(value.getW()), ST_LineEndLengthConverter.fromDocx4J(value.getLen()));
  }

  public static CTLineEndProperties toDocx4J(CT_LineEndPropertiesModel value) {
    return null;
  }
}
