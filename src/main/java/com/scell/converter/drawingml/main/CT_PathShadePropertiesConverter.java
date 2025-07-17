package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PathShadePropertiesModel;
import org.docx4j.dml.CTPathShadeProperties;

public class CT_PathShadePropertiesConverter {
  private CT_PathShadePropertiesConverter() {
  }

  public static CT_PathShadePropertiesModel fromDocx4j(CTPathShadeProperties value) {
    if (value == null) return null;
    return new CT_PathShadePropertiesModel(ST_PathShadeTypeConverter.fromDocx4j(value.getPath()), CT_RelativeRectConverter.fromDocx4j(value.getFillToRect()));
  }

  public static CTPathShadeProperties toDocx4j(CT_PathShadePropertiesModel value) {
    return null;
  }
}
