package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_NoFillPropertiesModel;
import org.docx4j.dml.CTNoFillProperties;

public class CT_NoFillPropertiesConverter {
  private CT_NoFillPropertiesConverter() {
  }

  public static CT_NoFillPropertiesModel fromDocx4j(CTNoFillProperties value) {
    if (value == null) return null;
    return new CT_NoFillPropertiesModel();
  }

  public static CTNoFillProperties toDocx4j(CT_NoFillPropertiesModel value) {
    return null;
  }
}
