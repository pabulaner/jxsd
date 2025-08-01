package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineEndPropertiesModel;
import org.docx4j.dml.CTLineEndProperties;

public class LineEndPropertiesConverter {
  private LineEndPropertiesConverter() {
  }

  public static LineEndPropertiesModel fromDocx4J(CTLineEndProperties value) {
    if (value == null) return null;
    return new LineEndPropertiesModel(LineEndTypeValueConverter.fromDocx4J(value.getType()), LineEndWidthValueConverter.fromDocx4J(value.getW()), LineEndLengthValueConverter.fromDocx4J(value.getLen()));
  }
}
