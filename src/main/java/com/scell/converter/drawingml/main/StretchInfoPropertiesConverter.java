package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.StretchInfoPropertiesModel;
import org.docx4j.dml.CTStretchInfoProperties;

public class StretchInfoPropertiesConverter {
  private StretchInfoPropertiesConverter() {
  }

  public static StretchInfoPropertiesModel fromDocx4J(CTStretchInfoProperties value) {
    if (value == null) return null;
    return new StretchInfoPropertiesModel(RelativeRectConverter.fromDocx4J(value.getFillRect()));
  }
}
