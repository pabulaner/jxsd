package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.NoFillPropertiesModel;
import org.docx4j.dml.CTNoFillProperties;

public class NoFillPropertiesConverter {
  private NoFillPropertiesConverter() {
  }

  public static NoFillPropertiesModel fromDocx4J(CTNoFillProperties value) {
    if (value == null) return null;
    return new NoFillPropertiesModel();
  }
}
