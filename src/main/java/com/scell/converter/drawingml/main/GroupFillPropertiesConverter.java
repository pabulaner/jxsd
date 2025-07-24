package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GroupFillPropertiesModel;
import org.docx4j.dml.CTGroupFillProperties;

public class GroupFillPropertiesConverter {
  private GroupFillPropertiesConverter() {
  }

  public static GroupFillPropertiesModel fromDocx4J(CTGroupFillProperties value) {
    if (value == null) return null;
    return new GroupFillPropertiesModel();
  }
}
