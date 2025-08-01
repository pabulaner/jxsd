package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineJoinMiterPropertiesModel;
import org.docx4j.dml.CTLineJoinMiterProperties;

public class LineJoinMiterPropertiesConverter {
  private LineJoinMiterPropertiesConverter() {
  }

  public static LineJoinMiterPropertiesModel fromDocx4J(CTLineJoinMiterProperties value) {
    if (value == null) return null;
    return new LineJoinMiterPropertiesModel(PositivePercentageValueConverter.fromDocx4J(value.getLim()));
  }
}
