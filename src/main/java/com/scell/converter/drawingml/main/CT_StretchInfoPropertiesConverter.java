package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_StretchInfoPropertiesModel;
import org.docx4j.dml.CTStretchInfoProperties;

public class CT_StretchInfoPropertiesConverter {
  private CT_StretchInfoPropertiesConverter() {
  }

  public static CT_StretchInfoPropertiesModel fromDocx4J(CTStretchInfoProperties value) {
    if (value == null) return null;
    return new CT_StretchInfoPropertiesModel(CT_RelativeRectConverter.fromDocx4J(value.getFillRect()));
  }

  public static CTStretchInfoProperties toDocx4J(CT_StretchInfoPropertiesModel value) {
    return null;
  }
}
