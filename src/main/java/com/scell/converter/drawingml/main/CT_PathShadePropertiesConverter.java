package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PathShadePropertiesModel;
import org.docx4j.dml.CTPathShadeProperties;

public class CT_PathShadePropertiesConverter {
  private CT_PathShadePropertiesConverter() {
  }

  public static CT_PathShadePropertiesModel fromDocx4J(CTPathShadeProperties value) {
    if (value == null) return null;
    return new CT_PathShadePropertiesModel(ST_PathShadeTypeConverter.fromDocx4J(value.getPath()), CT_RelativeRectConverter.fromDocx4J(value.getFillToRect()));
  }

  public static CTPathShadeProperties toDocx4J(CT_PathShadePropertiesModel value) {
    return null;
  }
}
