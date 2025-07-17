package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_StretchInfoPropertiesModel;
import org.docx4j.dml.CTStretchInfoProperties;

public class CT_StretchInfoPropertiesConverter {
  private CT_StretchInfoPropertiesConverter() {
  }

  public static CT_StretchInfoPropertiesModel fromDocx4j(CTStretchInfoProperties value) {
    if (value == null) return null;
    return new CT_StretchInfoPropertiesModel(CT_RelativeRectConverter.fromDocx4j(value.getFillRect()));
  }

  public static CTStretchInfoProperties toDocx4j(CT_StretchInfoPropertiesModel value) {
    return null;
  }
}
