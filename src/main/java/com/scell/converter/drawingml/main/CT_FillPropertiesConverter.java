package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_FillPropertiesModel;
import org.docx4j.dml.CTFillProperties;

public class CT_FillPropertiesConverter {
  private CT_FillPropertiesConverter() {
  }

  public static CT_FillPropertiesModel fromDocx4j(CTFillProperties value) {
    if (value == null) return null;
  }

  public static CTFillProperties toDocx4j(CT_FillPropertiesModel value) {
    return null;
  }
}
