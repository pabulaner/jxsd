package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GroupFillPropertiesModel;
import org.docx4j.dml.CTGroupFillProperties;

public class CT_GroupFillPropertiesConverter {
  private CT_GroupFillPropertiesConverter() {
  }

  public static CT_GroupFillPropertiesModel fromDocx4J(CTGroupFillProperties value) {
    if (value == null) return null;
    return new CT_GroupFillPropertiesModel();
  }

  public static CTGroupFillProperties toDocx4J(CT_GroupFillPropertiesModel value) {
    return null;
  }
}
